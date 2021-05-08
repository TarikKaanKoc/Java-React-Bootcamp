package business.concretes;

import business.abstracts.UsersService;
import dateAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsersManager implements UsersService {

    private UserDao userDao;

    public UsersManager(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public void add(User user) {
        if(isValid(user) && !ifMailExists(user)){
            userDao.add(user);
            System.out.println("Kullanıcı eklendi");
        }
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public void delete(User user) {
     userDao.delete(user);
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User get(int id) {
        return userDao.get(id);
    }

    @Override
    public List<String> getAllMails() {
        return userDao.getAllMails();
    }

    @Override
    public boolean ifMailExists(User user) {
        return userDao.isMailMatched(user);
    }

    @Override
    public boolean ifPasswordExists(User user) {
        return userDao.isPasswordMatched(user);
    }


    private boolean isValid(User user){
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(user.getUserMail());

        if(!matcher.matches()){
            System.out.println("E-Posta adresi hatalı ! ");
            return false;
        }
        else if(user.getFirstName().length()<2 && user.getLastName().length() <2 ) {
            System.out.println("Lütfen az 2 karakterden oluşan bir Ad / Soyad oluşturunuz.");
            return  false;
        }
        else if(user.getUserPassword().length()<6) {
            System.out.println("Lütfen en az 6 karakterden oluşan bir parola oluşturunuz.");
        }
        return true;
    }

}


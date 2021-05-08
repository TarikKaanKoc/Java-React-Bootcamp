package dateAccess.concretes;

import dateAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class MemoryUserDao implements UserDao {

    private List<User> users;

    public MemoryUserDao(){
        this.users = new ArrayList<User>();
    }


    @Override
    public void add(User user) {
        users.add(user);
    }

    @Override
    public void update(User user) {

        System.out.println("Güncellendi :D");


    }

    @Override
    public void delete(User user) {
         User deletedUser = users.stream().filter(x -> x.getId()==user.getId()).findFirst().get();
         users.remove(deletedUser);
    }

    @Override
    public List<User> getAllUsers() {

      return users;
    }

    @Override
    public User get(int id) {
        return users.stream().filter(userr -> userr.getId() == id ).findFirst().get();
    }

    @Override
    public List<String> getAllMails() {

        List<String> emails = new ArrayList<String>();
        for (User don : users ) {
            emails.add(don.getUserMail());
        }
        return emails;
    }

    @Override
    public boolean isMailMatched(User user) {
        return getAllMails().stream().anyMatch(mails -> mails.equals(user.getUserMail()));
    }

    @Override
    public boolean isPasswordMatched(User user) {
        return users.stream().anyMatch(users_ -> users_.getUserPassword().equals(user.getUserPassword()));
    }
}

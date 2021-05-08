package business.concretes;

import business.abstracts.AuthService;
import business.abstracts.UsersService;
import core.GoogleApiServiceAdapter;
import entities.concretes.User;

public class AuthManager implements AuthService {

    private UsersService userService;

    public AuthManager(UsersService userService) {
        this.userService = userService;
    }

    @Override
    public void signIn(User user) {
        if(isVerify(user) && userService.ifMailExists(user) && userService.ifPasswordExists(user)){
            System.out.println("Giriş Yapıldı");
        }
        else{
            System.out.println("Giriş Yapılmadı doğrulanmamış veya email ya da şifre uyuşmadı.");
        }

    }

    @Override
    public void signUp(User user) {
        userService.add(user);
        String code = randGenerator(user);
        System.out.println(code + " Doğrulama Kodunuz Gönderildi.");
        user.setVerifyCode(code);
    }

    @Override
    public void signWithGoogle(User user) {

        if(isVerify(user)){
                if(!userService.ifMailExists(user)){
                userService.add(user);
                user.setVerified(true);
            }
                else{
                    User user_ = userService.get(user.getId());
                    user_.setVerified(true);
                }
            GoogleApiServiceAdapter adapt = new GoogleApiServiceAdapter();
            adapt.signWithGoogle(user.getUserMail(), user.getUserPassword());
            return;

        }
        System.out.println("Doğrulunamadı");



    }

    @Override
    public void getVerifyState(User user, String kod) {
        User verifyUser  = userService.get(user.getId());
        if(kod.equals(user.getVerifyCode())){
            verifyUser.setVerified(true);
            System.out.println("Başarıyla Doğrulandı");
        }
    }


    private String randGenerator(User user){
        int gen = (int)Math.floor(Math.random() * 9999);
        return gen+""+user.getFirstName().substring(0,1) + ""+user.getLastName().substring(0,1);
    }


    private boolean isVerify(User user){
        if(user.isVerified() && (user.getUserMail().isBlank() && user.getUserMail() == null) && (user.getUserPassword().isBlank() && user.getUserPassword() == null) ){
            return false;
        }
        return true;
    }
}

package console;

import business.concretes.AuthManager;
import business.concretes.UsersManager;
import dateAccess.concretes.MemoryUserDao;
import entities.concretes.User;

public class Main {

    public static void main(String[] args) {

        User kullanici1 = new User();
        kullanici1.setFirstName("Tarık kaan");
        kullanici1.setLastName("Koç");
        kullanici1.setId(1);
        kullanici1.setUserMail("tarikkaan1koc@gmail.com");
        kullanici1.setUserPassword("4129774tarik");

        User kullanici2 = new User();
        kullanici2.setFirstName("kerim");
        kullanici2.setLastName("koç");
        kullanici2.setId(2);
        kullanici2.setUserMail("kerim1koc@gmail.com");
        kullanici2.setUserPassword("4129774kerim");



        UsersManager userManager = new UsersManager(new MemoryUserDao());

        AuthManager auth = new AuthManager(userManager);
      //  auth.signUp(kullanici2);
        auth.signWithGoogle(kullanici2);
        auth.getVerifyState(kullanici2, kullanici2.getVerifyCode());

        auth.signIn(kullanici2);
        userManager.update(kullanici2);




    }
}

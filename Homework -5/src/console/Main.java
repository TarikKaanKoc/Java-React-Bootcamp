package console;

import business.concretes.AuthManager;
import business.concretes.UsersManager;
import dateAccess.concretes.MemoryUserDao;
import entities.concretes.User;

public class Main {

    public static void main(String[] args) {
	// write your code here
        User kullanici1 = new User();
        kullanici1.setFirstName("Abuzittin");
        kullanici1.setLastName("Cabbar");
        kullanici1.setId(1);
        kullanici1.setUserMail("abuzzittin.cabbaradana@gmail.com");
        kullanici1.setUserPassword("adanamerkezpatlıyorherkez");

        User kullanici2 = new User();
        kullanici2.setFirstName("Cabbar");
        kullanici2.setLastName("Gel Oğlum Buraya");
        kullanici2.setId(2);
        kullanici2.setUserMail("cabbar@gmail.com");
        kullanici2.setUserPassword("cabbarrr");



        UsersManager userManager = new UsersManager(new MemoryUserDao());

        AuthManager auth = new AuthManager(userManager);
      //  auth.signUp(kullanici2);
        auth.signWithGoogle(kullanici2);
        auth.getVerifyState(kullanici2, kullanici2.getVerifyCode());

        auth.signIn(kullanici2);
        userManager.update(kullanici2);




    }
}

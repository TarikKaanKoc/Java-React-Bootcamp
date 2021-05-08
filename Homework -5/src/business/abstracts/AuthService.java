package business.abstracts;

import entities.concretes.User;

public interface AuthService {
    void signIn(User user);
    void signUp(User user);
    void signWithGoogle(User user);
    void getVerifyState(User user,String kod);

}

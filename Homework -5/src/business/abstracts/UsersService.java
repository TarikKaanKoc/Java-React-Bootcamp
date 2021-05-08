package business.abstracts;

import entities.concretes.User;

import java.util.List;

public interface UsersService {

    void add(User user);
    void update(User user);
    void delete(User user);
    List<User> getAllUsers();
    User get (int id);
    List<String> getAllMails();
    boolean ifMailExists(User user);
    boolean ifPasswordExists(User user);
}

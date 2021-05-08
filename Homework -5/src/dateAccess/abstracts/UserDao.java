package dateAccess.abstracts;


import entities.concretes.User;

import java.util.List;

public interface UserDao {

    void add(User user);
    void update(User user);
    void delete(User user);
    List<User> getAllUsers();
    User get (int id);
    List<String> getAllMails();
    boolean isMailMatched (User user);
    boolean isPasswordMatched (User user);

}

package dao;

import model.User;
import java.util.Set;

public interface UserDao {

    void save(User user);

    User findById(int userId);

    User findByName(String name);

    User findByEMail(String eMail);
}
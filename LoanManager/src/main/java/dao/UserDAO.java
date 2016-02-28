package dao;

import model.User;
import java.util.Set;

public interface UserDAO {

    void save(User user);

    Set<User> findAll();

    User findById(Integer userID);

    User findByName(String name);

    User findByEMail(String eMail);
}
package service;

import model.User;

import java.util.Set;

public interface UserService {

    void save(User user);

    Set<User> findAll();

    User findById(Integer userID);

    User findByName(String name);

    User findByEMail(String eMail);
}

package dao;

import model.User;
import java.util.Set;

public interface UserDAO {

    public void save(User user);

    public Set<User> findAll();

    public User findById(Integer userID);

    public User findByName(String name);

    public User findByEMail(String eMail);
}
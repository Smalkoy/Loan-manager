package dao;

import model.User;
import java.util.Set;

public interface UserDAO {
    public void save(User user);

    public void update(User user);

    public User findById(Integer userID);

    public User findByEMail(String eMail);

    public Set<User> findByGroup(String group);

    public Set<User> findAll();
}
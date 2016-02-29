package service.service_impl;

import dao.UserDao;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.UserService;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDAO;

    public void setUserDAO(UserDao userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void save(User user){
        userDAO.save(user);
    }

    @Override
    public Set<User> findAll() {
        return userDAO.findAll();
    }

    @Override
    public User findById(Integer userID) {
        return userDAO.findById(userID);
    }

    @Override
    public User findByName(String name) {
        return userDAO.findByName(name);
    }

    @Override
    public User findByEMail(String eMail) {
        return userDAO.findByEMail(eMail);
    }
}

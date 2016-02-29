package dao.hibernate;

import dao.UserDAO;
import model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Repository("userDAO")
@Transactional
public class UserDAOImpl implements UserDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Autowired
    public UserDAOImpl() {
    }

    @Override
    public void save(User user) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.saveOrUpdate(user);
            session.getTransaction().commit();
        } finally {
            session.close();
        }
    }

    @Override
    public Set findAll() {
        Session session = sessionFactory.openSession();
        try {
            return (Set<User>) session.createCriteria(User.class)
                    .addOrder(Order.asc("name"))
                    .list();
        } finally {
            session.close();
        }
    }

    public User findById(Integer userID) {
        Session session = sessionFactory.openSession();
        try {
            return (User) session.createCriteria(User.class)
                    .add(Restrictions.eq("id", userID))
                    .list();
        } finally {
            session.close();
        }
    }


    @Override
    public User findByName(String userName) {
        Session session = sessionFactory.openSession();
        try {
            return (User) session.createCriteria(User.class)
                    .add(Restrictions.like("name", userName))
                    .list();
        } finally {
            session.close();
        }
    }

    @Override
    public User findByEMail(String email) {
        Session session = sessionFactory.openSession();
        try {
            return (User) session.createCriteria(User.class)
                    .add(Restrictions.eq("e-mail", email))
                    .list();
        } finally {
            session.close();
        }
    }
}

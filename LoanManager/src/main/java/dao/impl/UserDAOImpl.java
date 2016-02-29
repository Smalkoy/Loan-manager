package dao.impl;

import dao.UserDao;
import model.User;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl extends BaseDaoImpl implements UserDao {

    @Autowired
    SessionFactory sessionFactory;

    @Autowired
    public UserDaoImpl() {
    }

    @Override
    public void save(User user) {
        sessionFactory.getCurrentSession().saveOrUpdate(user);
    }

    @Override
    public User findById(int userId) {
        return (User) sessionFactory.getCurrentSession().get(User.class, userId);
    }


    @Override
    public User findByName(String userName) {
        return (User) sessionFactory.getCurrentSession().createCriteria(User.class)
                .add(Restrictions.eq("NAME", userName)).uniqueResult();
    }

    @Override
    public User findByEMail(String email) {
        return (User) sessionFactory.getCurrentSession().createCriteria(User.class)
                .add(Restrictions.eq("E_MAIL", email)).uniqueResult();
    }
}

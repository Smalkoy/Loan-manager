package dao.impl;

import dao.GroupDao;
import model.Group;
import org.hibernate.criterion.Restrictions;

public class GroupDaoImpl extends BaseDaoImpl implements GroupDao {

    @Override
    public Group findById(int groupId) {
        return sessionFactory.getCurrentSession().get(Group.class, groupId);
    }

    @Override
    public Group findByName(String name) {
        return (Group) sessionFactory.getCurrentSession().createCriteria(Group.class)
                .add(Restrictions.eq("NAME", name)).uniqueResult();
    }
}

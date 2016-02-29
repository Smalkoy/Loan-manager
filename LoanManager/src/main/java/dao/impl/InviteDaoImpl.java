package dao.impl;

import dao.InviteDao;
import model.Invite;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class InviteDaoImpl extends BaseDaoImpl implements InviteDao {

    @Override
    public Invite findById(int inviteId) {
        return sessionFactory.getCurrentSession().get(Invite.class, inviteId);
    }

    @Override
    public List<Invite> findAllByInviter(int userInviterId) {
        return sessionFactory.getCurrentSession().createCriteria(Invite.class)
                .add(Restrictions.eq("INVITER_ID", userInviterId)).list();
    }

    @Override
    public List<Invite> findAllByTarget(int userTargetId) {
        return sessionFactory.getCurrentSession().createCriteria(Invite.class)
                .add(Restrictions.eq("TARGET_ID", userTargetId)).list();
    }
}

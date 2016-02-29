package dao.impl;

import dao.BalanceDao;
import model.Balance;
import model.Invite;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class BalanceDaoImpl extends BaseDaoImpl implements BalanceDao{

    @Override
    public List<Balance> findByGroupId(int groupId) {
        return sessionFactory.getCurrentSession().createCriteria(Balance.class)
                .add(Restrictions.eq("GROUP_ID", groupId)).list();
    }

    @Override
    public List<Balance> findByLenderId(int lenderId) {
        return sessionFactory.getCurrentSession().createCriteria(Balance.class)
                .add(Restrictions.eq("LENDER_ID", lenderId)).list();
    }

    @Override
    public List<Balance> findByBorrowerId(int borrowerId) {
        return sessionFactory.getCurrentSession().createCriteria(Balance.class)
                .add(Restrictions.eq("BORROWER_ID", borrowerId)).list();
    }
}

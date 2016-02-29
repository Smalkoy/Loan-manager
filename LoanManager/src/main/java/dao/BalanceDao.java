package dao;

import model.Balance;

import java.util.List;

public interface BalanceDao {

    List<Balance> findByGroupId(int groupId);

    List<Balance> findByLenderId(int lenderId);

    List<Balance> findByBorrowerId(int borrowerId);
}

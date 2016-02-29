package dao;

import model.BaseEntity;

public interface BaseDao {
    void create (BaseEntity obj);
    void update (BaseEntity obj);
    void delete (BaseEntity obj);
    BaseEntity read (int id, Class clazz);
}

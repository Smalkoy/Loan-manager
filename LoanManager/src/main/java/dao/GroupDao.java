package dao;

import model.Group;

public interface GroupDao {

    Group findById (int groupId);

    Group findByName (String name);
}

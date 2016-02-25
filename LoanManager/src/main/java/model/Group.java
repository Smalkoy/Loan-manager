package model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "groups")
public class Group extends BaseEntity{

    @Column(name = "name")
    @NotEmpty
    protected String name;

    public Group() {
    }

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "groups")
    private Set<User> users;

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

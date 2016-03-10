package model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "GROUP")
public class Group extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GROUP_ID")
    private int id;

    @Column(name = "NAME")
    @NotEmpty
    private String name;

    public Group() {
    }

    @ManyToMany
    @JoinTable(name = "USER_GROUP",
            joinColumns = @JoinColumn(name = "GROUP_ID", referencedColumnName = "GROUP_ID"),
            inverseJoinColumns = @JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID")
    )
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

package model;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "USERS")
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_NAME")
    private int id;

    @Column(name = "NAME", length = 25, nullable = false)
    @NotBlank(message = "Name should not be empty")
    protected String name;

    @Column(name = "PASSWORD", unique = false, nullable = false, length = 50)
    @NotBlank(message = "Enter some password")
    protected String password;

    @Column(name = "E_MAIL", length = 255, nullable = false)
    @NotEmpty
    protected String eMail;

    @Column(name = "E_MAIL_IS_VERIFIED")
    protected boolean isEMailVerified;

    public User() {
    }

    @ManyToMany
    @JoinTable(name = "USER_GROUP",
            joinColumns = @JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID"),
            inverseJoinColumns = @JoinColumn(name = "GROUP_ID", referencedColumnName = "GROUP_D")
    )
    private Set<Group> groups;

    public Set<Group> getGroups() {
        return groups;
    }

    public void setGroups(Set<Group> groups) {
        this.groups = groups;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEMailVerified() {
        return isEMailVerified;
    }

    public void setEMailVerified(boolean isEMailVerified) {
        this.isEMailVerified = isEMailVerified;
    }
}

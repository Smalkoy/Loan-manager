package model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @Column(name = "name")
    @NotEmpty
    protected String name;

    @Column(name = "e-mail")
    @NotEmpty
    protected String eMail;

    @Column(name = "password")
    @NotEmpty
    protected String password;

    @Column(name = "verified_e-mail")
    @NotEmpty
    protected boolean verifiedEMail;

    @Column(name = "creation_date")
    @NotEmpty
    protected long creationDate;

    public User() {
    }

    public User(String name, String eMail, String password, Integer creationDate) {
        this.name = name;
        this.eMail = name;
        this.password = password;
        this.verifiedEMail = false;
        this.creationDate = creationDate;
    }

    public User(String name, String eMail, String password, boolean varifiedEMail, Integer creationDate) {
        this.name = name;
        this.eMail = name;
        this.password = password;
        this.verifiedEMail = varifiedEMail;
        this.creationDate = creationDate;
    }

    @ManyToMany
    @JoinTable(name = "user_group",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "group_id", referencedColumnName = "id")
    )
    private Set<Group> groups;

    public Set<Group> getBooks() {
        return groups;
    }

    public void setBooks(Set<Group> groups) {
        this.groups = groups;
    }

    public String getName() {
        return this.name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isVerifiedEMail() {
        return verifiedEMail;
    }

    public void setVerifiedEMail(boolean varifiedEMail) {
        this.verifiedEMail = varifiedEMail;
    }

    public long getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(long creationDate) {
        this.creationDate = creationDate;
    }
}

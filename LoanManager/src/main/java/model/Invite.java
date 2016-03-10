package model;

import javax.persistence.*;

@Entity
@Table(name = "INVITE")
public class Invite extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "INVITE_ID")
    private int id;

    @ManyToOne
    @JoinColumn(name = "INVITER_ID")
    private User inviter;

    @ManyToOne
    @JoinColumn(name = "TARGET_ID")
    private User target;

    @ManyToOne
    @JoinColumn(name = "GROUP_ID")
    private Group group;

    public Invite() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getInviter() {
        return inviter;
    }

    public void setInviter(User inviter) {
        this.inviter = inviter;
    }

    public User getTarget() {
        return target;
    }

    public void setTarget(User target) {
        this.target = target;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}

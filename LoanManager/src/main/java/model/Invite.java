package model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "invites")
public class Invite extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "inviter_id")
    protected User inviter;

    @ManyToOne
    @JoinColumn(name = "target_id")
    protected User target;

    @ManyToOne
    @JoinColumn(name = "group_id")
    protected Group group;

    public Invite() {
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

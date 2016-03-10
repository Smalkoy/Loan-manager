package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "EVENT")
public class Event extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EVENT_ID")
    private int id;

    @OneToOne
    @Column(name = "INITIATOR_USER")
    private User initiatorUser;

    @OneToOne
    @Column(name = "EVENT_TYPE_ID")
    private Event eventType;

    @OneToOne
    @Column(name = "GROUP_ID")
    private Group group;

    @OneToOne
    @Column(name = "TARGET_USER_ID")
    private User targetUser;

    @OneToOne
    @Column(name = "INVITE_ID")
    private Invite invite;

    
    @Column("TRANSACTIONS")
    private List<Transaction> transactions;

    @Column(name = "REVERTING_EVENT_ID")
    private int revertingEventId;

    public int getEventTypeId() {
        return eventTypeId;
    }

    public void setEventTypeId(int eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInitiatorUser() {
        return initiatorUser;
    }

    public void setInitiatorUser(int initiatorUser) {
        this.initiatorUser = initiatorUser;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getTargetUserId() {
        return targetUserId;
    }

    public void setTargetUserId(int targetUserId) {
        this.targetUserId = targetUserId;
    }

    public int getInviteId() {
        return inviteId;
    }

    public void setInviteId(int inviteId) {
        this.inviteId = inviteId;
    }

    public int getRevertingEventId() {
        return revertingEventId;
    }

    public void setRevertingEventId(int revertingEventId) {
        this.revertingEventId = revertingEventId;
    }
}

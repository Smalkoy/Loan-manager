package model;

import javax.persistence.*;

@Entity
@Table(name = "TRANSACTION")
public class Transaction extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TRANSACTION_ID")
    private int id;

    @Column(name = "EVENT_ID")
    private int eventId;

    @Column(name = "SENDER_ID")
    private int senderId;

    @Column(name = "RECEIVER_ID")
    private int receiverId;

    @Column(name = "AMOUNT")
    private float amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public int getSenderId() {
        return senderId;
    }

    public void setSenderId(int senderId) {
        this.senderId = senderId;
    }

    public int getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(int receiverId) {
        this.receiverId = receiverId;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}

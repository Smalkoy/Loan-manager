package model;

import javax.persistence.*;

@Entity
@Table(name = "EVENT_TYPE")
public class EventType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EVENT_TYPE_ID")
    private int id;

    @Column(name = "EVENT_TYPE")
    private String eventType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
}

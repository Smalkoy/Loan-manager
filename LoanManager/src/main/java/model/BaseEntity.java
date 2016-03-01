package model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@MappedSuperclass
public class BaseEntity {

    @Temporal(TemporalType.DATE)
    @Column(name = "CREATION_DATE")
    @NotNull
    protected Date creationDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "LAST_UPDATE_DATE")
    @NotNull
    protected Date lastUpdateDate;

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }
}
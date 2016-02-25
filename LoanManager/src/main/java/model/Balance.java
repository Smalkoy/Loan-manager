package model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "balance")
public class Balance extends BaseEntity{

    @Column(name = "name")
    @NotEmpty
    protected String name;

    @Column(name = "amount")
    @NotNull
    protected double amount;

    @ManyToOne
    @JoinColumn(name = "lender_id")
    protected User lender;

    @ManyToOne
    @JoinColumn(name = "borrower_id")
    protected User borrower;

    @ManyToOne
    @JoinColumn(name = "group_id")
    protected Group group;

    public Balance() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public User getLender() {
        return lender;
    }

    public void setLender(User lender) {
        this.lender = lender;
    }

    public User getBorrower() {
        return borrower;
    }

    public void setBorrower(User borrower) {
        this.borrower = borrower;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

}

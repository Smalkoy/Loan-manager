package model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "BALANCE")
public class Balance extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BALANCE_ID")
    private int id;

    @Column(name = "AMOUNT")
    @NotNull
    private double amount;

    @ManyToOne
    @JoinColumn(name = "LENDER_ID")
    private User lender;

    @ManyToOne
    @JoinColumn(name = "BORROWER_ID")
    private User borrower;

    @ManyToOne
    @JoinColumn(name = "GROUP_ID")
    private Group group;

    public Balance() {
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

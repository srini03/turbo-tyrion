package com.springapp.batch;

/**
 * Created by srini on 2/23/15.
 */
import java.math.BigDecimal;
import java.util.List;

public class Account {


    private long id = 1;
    private String accountNumber;
    private Customer cust;
    private BigDecimal cashBalance;
   // private PricingTier tier;
    private BigDecimal tier;
    private List<Transaction> transactions;

    public void setId(long id) {
        this.id = id;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }

    public void setCashBalance(BigDecimal cashBalance) {
        this.cashBalance = cashBalance;
    }

    //public void setTier(PricingTier tier)
    public void setTier(BigDecimal tier) {
        this.tier = tier;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public long getId() {
        return id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Customer getCust() {
        return cust;
    }

    public BigDecimal getCashBalance() {
        return cashBalance;
    }

    //public PricingTier getTier()
    public BigDecimal getTier() {
        return tier;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

}

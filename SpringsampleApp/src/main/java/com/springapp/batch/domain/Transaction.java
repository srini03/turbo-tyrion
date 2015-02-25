package com.springapp.batch.domain;

/**
 * Created by srini on 2/23/15.
 */
import java.math.BigDecimal;
import java.util.Date;

public class Transaction {


    private long id;
    private long accountId;
    private String accountNumber;
    private String ticker;
    private long tickerId;
    private long quantity;
    private Date tradeTimestamp;
    private BigDecimal dollarAmount;
    private TransactionType type;

    public void setId(long id) {
        this.id = id;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public void setTickerId(long tickerId) {
        this.tickerId = tickerId;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public void setTradeTimestamp(Date tradeTimestamp) {
        this.tradeTimestamp = tradeTimestamp;
    }

    public void setDollarAmount(BigDecimal dollarAmount) {
        this.dollarAmount = dollarAmount;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public long getAccountId() {
        return accountId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getTicker() {
        return ticker;
    }

    public long getTickerId() {
        return tickerId;
    }

    public long getQuantity() {
        return quantity;
    }

    public Date getTradeTimestamp() {
        return tradeTimestamp;
    }

    public BigDecimal getDollarAmount() {
        return dollarAmount;
    }

    public TransactionType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Sold " + quantity + " of " + ticker;
    }
}

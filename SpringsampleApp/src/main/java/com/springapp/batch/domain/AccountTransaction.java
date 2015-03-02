package com.springapp.batch.domain;

/**
 * Created by srini on 3/1/15.
 */
import java.math.BigDecimal;

public class AccountTransaction extends Transaction {

    private String accountNumber;
    private PricingTier tier;
    private BigDecimal fee;
    private long quantity;
    private BigDecimal price;

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public PricingTier getTier() {
        return tier;
    }

    public void setTier(PricingTier tier) {
        this.tier = tier;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    @Override
    public long getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return getId() + ":" + accountNumber + ":" + getTicker() +
                ":" + getTradeTimestamp().getTime() + ":" + fee;
    }
}

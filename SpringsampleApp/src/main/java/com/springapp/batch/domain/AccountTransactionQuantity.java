package com.springapp.batch.domain;

/**
 * Created by srini on 3/1/15.
 */
public class AccountTransactionQuantity {

    private String accountNumber;
    private long transactionCount;
    private PricingTier tier;


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getTransactionCount() {
        return transactionCount;
    }

    public void setTransactionCount(long transactionCount) {
        this.transactionCount = transactionCount;
    }

    public PricingTier getTier() {
        return tier;
    }

    public void setTier(PricingTier tier) {
        this.tier = tier;
    }

    @Override
    public String toString() {
        return accountNumber + " has " + transactionCount +
                " transactions this month which falls into tier " + tier;
    }
}

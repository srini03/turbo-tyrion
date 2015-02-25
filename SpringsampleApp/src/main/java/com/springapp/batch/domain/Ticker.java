package com.springapp.batch.domain;

import java.math.BigDecimal;

/**
 * Created by srini on 2/24/15.
 */
public class Ticker {

    private long id = 1;
    private String Ticker;

    private BigDecimal Price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTicker() {
        return Ticker;
    }

    public void setTicker(String ticker) {
        Ticker = ticker;
    }

    public BigDecimal getPrice() {
        return Price;
    }

    public void setPrice(BigDecimal price) {
        Price = price;
    }

}

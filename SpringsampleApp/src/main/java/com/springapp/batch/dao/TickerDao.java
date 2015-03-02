package com.springapp.batch.dao;

/**
 * Created by srini on 2/24/15.
 */

import com.springapp.batch.domain.Ticker;
import com.springapp.batch.domain.Transaction;

import java.math.BigDecimal;

import java.util.List;

public interface TickerDao {
    public Ticker findTickerBySymbol(String symbol);
    public void saveTicker(Ticker ticker);
    public List<String> getTickersPaged(int page, int pageSize);
    BigDecimal getTotalValueForCustomer(long id);
    List<Transaction> getStocksForCustomer(long id);

}




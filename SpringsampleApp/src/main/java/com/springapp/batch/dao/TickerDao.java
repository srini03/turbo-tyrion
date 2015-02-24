package com.springapp.batch.dao;

/**
 * Created by srini on 2/24/15.
 */

import com.springapp.batch.Account;

public class TickerDao {
    public Ticker findTickerBySymbol(String symbol);
    public void saveTicker(Ticker ticker);

}




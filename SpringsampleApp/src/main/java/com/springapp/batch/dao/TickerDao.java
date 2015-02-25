package com.springapp.batch.dao;

/**
 * Created by srini on 2/24/15.
 */

import com.springapp.batch.domain.Ticker;

public interface TickerDao {
    public Ticker findTickerBySymbol(String symbol);
    public void saveTicker(Ticker ticker);

}




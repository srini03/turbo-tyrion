package com.springapp.batch.dao.impl;

/**
 * Created by srini on 2/24/15.
 */

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springapp.batch.dao.TickerDao;
import com.springapp.batch.domain.Ticker;
import com.springapp.batch.domain.Transaction;

public class TickerDaoJdbc extends JdbcTemplate implements TickerDao {

    private static final String FIND_BY_SYMBOL = "select * from ticker t where ticker = ?";
    private static final String SAVE_TICKER = "insert into ticker (ticker, currentPrice) values (?,?)";

    @SuppressWarnings("unchecked")
    public Ticker findTickerBySymbol(String symbol) {
        List<Ticker> tickers = query(FIND_BY_SYMBOL, new Object[]{symbol}, new RowMapper() {

            public Object mapRow(ResultSet rs, int arg1) throws SQLException {
                Ticker ticker = new Ticker();

                ticker.setId(rs.getLong("id"));
                ticker.setPrice(rs.getBigDecimal("currentPrice"));
                ticker.setTicker(rs.getString("ticker"));

                return ticker;
            }
        });

        if (tickers != null && tickers.size() > 0) {
            return tickers.get(0);
        } else {
            return null;
        }
    }

    public void saveTicker(Ticker ticker) {
        update(SAVE_TICKER, new Object[]{ticker.getTicker(), ticker.getPrice()});
    }
}

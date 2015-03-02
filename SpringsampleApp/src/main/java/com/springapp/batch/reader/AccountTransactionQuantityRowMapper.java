package com.springapp.batch.reader;

/**
 * Created by srini on 3/1/15.
 */
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springapp.batch.domain.AccountTransactionQuantity;

public class AccountTransactionQuantityRowMapper implements RowMapper {

    public AccountTransactionQuantity mapRow(ResultSet resultSet, int arg1)
            throws SQLException {
        AccountTransactionQuantity qty = new AccountTransactionQuantity();

        qty.setAccountNumber(resultSet.getString("accountNumber"));
        qty.setTransactionCount(resultSet.getLong("qty"));

        return qty;
    }
}

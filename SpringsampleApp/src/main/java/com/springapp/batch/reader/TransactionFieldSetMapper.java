package com.springapp.batch.reader;

/**
 * Created by srini on 2/23/15.
 */
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.springapp.batch.Transaction;

public class TransactionFieldSetMapper implements FieldSetMapper<Transaction> {

    public Transaction mapFieldSet(FieldSet fieldSet) throws BindException {
        Transaction trans = new Transaction();

        trans.setAccountNumber(fieldSet.readString("accountNumber"));
        trans.setQuantity(fieldSet.readLong("quantity"));
        trans.setTicker(fieldSet.readString("stockTicker"));
        trans.setTradeTimestamp(fieldSet.readDate("timestamp", "yyyy-MM-dd HH:mm:ss"));
        trans.setDollarAmount(fieldSet.readBigDecimal("price"));

        return trans;
    }
}

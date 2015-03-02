package com.springapp.batch.reader;

/**
 * Created by srini on 3/1/15.
 */
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import com.springapp.batch.dao.TickerDao;
import com.springapp.batch.domain.Customer;
import com.springapp.batch.domain.Statement;

public class CustomerStatementReader implements ItemReader<Statement> {

    private ItemReader<Customer> customerReader;
    private TickerDao tickerDao;

    public Statement read() throws Exception, UnexpectedInputException,
            ParseException {

        Customer customer = customerReader.read();

        if(customer == null) {
            return null;
        } else {
            Statement statement = new Statement();

            statement.setCustomer(customer);
            statement.setSecurityTotal(tickerDao.getTotalValueForCustomer(customer.getId()));
            statement.setStocks(tickerDao.getStocksForCustomer(customer.getId()));

            return statement;
        }
    }

    public void setCustomerReader(ItemReader<Customer> customerReader) {
        this.customerReader = customerReader;
    }

    public void setTickerDao(TickerDao tickerDao) {
        this.tickerDao = tickerDao;
    }
}

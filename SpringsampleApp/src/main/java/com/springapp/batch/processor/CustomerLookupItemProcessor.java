package com.springapp.batch.processor;

/**
 * Created by srini on 2/23/15.
 */

import org.springframework.batch.item.ItemProcessor;
import com.springapp.batch.domain.Account;
import com.springapp.batch.domain.Customer;
import com.springapp.batch.domain.Transaction;
import com.springapp.batch.dao.AccountDao;
import com.springapp.batch.dao.CustomerDao;
import com.springapp.batch.dao.TickerDao;
import com.springapp.batch.domain.Ticker;



import com.springapp.batch.domain.TransactionType;
import com.springapp.batch.exception.InvalidItemException;

public class CustomerLookupItemProcessor implements ItemProcessor<Object, Object> {

    private CustomerDao customerDao;
    private TickerDao tickerDao;
    private AccountDao accountDao;

    public Object process(Object curItem) throws Exception {
        if(curItem instanceof Customer) {
            doCustomerUpdate((Customer) curItem);
        } else if(curItem instanceof Transaction){
            doTransactionUpdate((Transaction) curItem);
        } else {
            throw new InvalidItemException("An invalid item was received: " + curItem);
        }

        return curItem;
    }

    private void doTransactionUpdate(Transaction curItem) {
        updateTicker(curItem);
        updateAccount(curItem);

        curItem.setType(TransactionType.STOCK);
    }

    private void updateAccount(Transaction curItem) {
        Account account = accountDao.findAccountByNumber(curItem.getAccountNumber());

        curItem.setAccountId(account.getId());
    }

    private void updateTicker(Transaction curItem) {
        Ticker ticker = tickerDao.findTickerBySymbol(curItem.getTicker());

        if(ticker == null) {
            Ticker newTicker = new Ticker();
            newTicker.setTicker(curItem.getTicker());

            tickerDao.saveTicker(newTicker);
            ticker = tickerDao.findTickerBySymbol(curItem.getTicker());
        }

        curItem.setTickerId(ticker.getId());
    }

    private void doCustomerUpdate(Customer curCustomer) {
        Customer storedCustomer = customerDao.findCustomerByTaxId(curCustomer.getTaxId());
        Account account = accountDao.findAccountByNumber(curCustomer.getAccount().getAccountNumber());



        curCustomer.setId(storedCustomer.getId());
        curCustomer.setAccount(account);
    }

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public void setTickerDao(TickerDao tickerDao) {
        this.tickerDao = tickerDao;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
}

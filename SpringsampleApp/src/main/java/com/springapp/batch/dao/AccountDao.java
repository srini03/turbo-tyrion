package com.springapp.batch.dao;

/**
 * Created by srini on 2/24/15.
 */
import com.springapp.batch.domain.Account;

public interface AccountDao
{
    public Account findAccountByNumber(String accountNumber);
}

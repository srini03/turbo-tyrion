package com.springapp.batch.dao;

/**
 * Created by srini on 2/24/15.
 */


import com.springapp.batch.Customer;

public interface CustomerDao
{

    public Customer findCustomerByTaxId(String taxId);
}
package com.springapp.batch.reader;

/**
 * Created by srini on 2/23/15.
 */
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.springapp.batch.Account;
import com.springapp.batch.Address;
import com.springapp.batch.Customer;

public class CustomerFieldSetMapper implements FieldSetMapper<Customer> {

    public Customer mapFieldSet(FieldSet fieldSet) throws BindException {
        Customer customer = new Customer();

        customer.setFirstName(fieldSet.readString("firstName"));
        customer.setLastName(fieldSet.readString("lastName"));
        customer.setTaxId(fieldSet.readString("taxId"));
        customer.setAddress(buildAddress(fieldSet));
        customer.setAccount(buildAccount(fieldSet, customer));

        return customer;
    }

    private Account buildAccount(FieldSet fieldSet, Customer cust) {
        Account account = new Account();

        account.setAccountNumber(fieldSet.readString("accountNumber"));
        account.setCust(cust);

        return account;
    }

    private Address buildAddress(FieldSet fieldSet) {
        Address address = new Address();

        address.setAddress1(fieldSet.readString("address"));
        address.setCity(fieldSet.readString("city"));
        address.setState(fieldSet.readString("state"));
        address.setZip(fieldSet.readString("zip"));

        return address;
    }
}


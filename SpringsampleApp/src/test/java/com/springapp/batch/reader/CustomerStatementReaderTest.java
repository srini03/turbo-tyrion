package com.springapp.batch.reader;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.batch.item.ItemReader;

import com.springapp.batch.dao.TickerDao;
import com.springapp.batch.domain.Customer;
import com.springapp.batch.domain.Statement;
import com.springapp.batch.domain.Transaction;

public class CustomerStatementReaderTest {

    private CustomerStatementReader reader;
    @Mock
    private TickerDao tickerDao;
    @Mock
    private ItemReader<Customer> customerReader;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        reader = new CustomerStatementReader();
        reader.setCustomerReader(customerReader);
        reader.setTickerDao(tickerDao);
    }

    @Test
    public void testReadNoCustomers() throws Exception {
        assertNull(reader.read());
    }

    @SuppressWarnings("serial")
    @Test
    public void testReadWithCustomer() throws Exception {
        Customer customer = new Customer();
        customer.setId(5l);

        when(customerReader.read()).thenReturn(customer);
        when(tickerDao.getTotalValueForCustomer(5l)).thenReturn(
                new BigDecimal("500.00"));
        when(tickerDao.getStocksForCustomer(5l)).thenReturn(
                new ArrayList<Transaction>() {
                    {
                        add(new Transaction());
                    }
                });

        Statement result = reader.read();

        assertEquals(customer, result.getCustomer());
        assertEquals(501.00, result.getSecurityTotal().doubleValue(), 0);
        assertEquals(1, result.getStocks().size());
    }
}

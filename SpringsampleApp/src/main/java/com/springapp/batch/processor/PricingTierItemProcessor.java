package com.springapp.batch.processor;

/**
 * Created by srini on 3/1/15.
 */

import java.util.ArrayList;
import java.util.List;
import org.springframework.batch.item.ItemProcessor;

import com.springapp.batch.domain.AccountTransactionQuantity;
import com.springapp.batch.domain.PricingTier;

public class PricingTierItemProcessor implements ItemProcessor<AccountTransactionQuantity,
        AccountTransactionQuantity> {

    private List<Integer> accountsProcessed = new ArrayList<Integer>();

    public AccountTransactionQuantity process(AccountTransactionQuantity atq)
            throws Exception {

        if(atq.getTransactionCount() <= 1000) {
            atq.setTier(PricingTier.I);
        } else if(atq.getTransactionCount() > 1000 &&
                atq.getTransactionCount() <= 100000) {
            atq.setTier(PricingTier.II);

        } else if(atq.getTransactionCount() > 100000 && atq.getTransactionCount() <= 1000000) {
            atq.setTier(PricingTier.III);
        } else {
            atq.setTier(PricingTier.IV);
        }

        return atq;
    }
}

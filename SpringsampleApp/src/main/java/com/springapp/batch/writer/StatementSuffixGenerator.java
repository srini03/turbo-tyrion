package com.springapp.batch.writer;

/**
 * Created by srini on 3/2/15.
 */

import org.springframework.batch.item.file.ResourceSuffixCreator;

public class StatementSuffixGenerator implements ResourceSuffixCreator {

    public String getSuffix(int arg0) {
        return arg0 + ".txt";
    }
}

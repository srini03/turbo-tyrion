package com.springapp.batch;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by srini on 3/3/15.
 */
public class sample {

    @Test
    public void testStringEquals() {
        String michael = "Michael";
        String michael2 = michael;
        String michael3 = new String("Michael");
        String michael4 = "Michael";

        assertTrue(michael == michael2);
        assertFalse(michael == michael3);
        assertTrue(michael.equals(michael2));
        assertTrue(michael.equals(michael3));
        assertTrue(michael == michael4);
        assertTrue(michael.equals(michael4));
    }
}

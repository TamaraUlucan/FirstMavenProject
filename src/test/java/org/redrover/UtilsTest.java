package org.redrover;


import org.redrower.Utils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UtilsTest {

    @Test
    public void testSum() {
        Assert.assertEquals(Utils.sum(2, 4), 6);

    }
    @Test
            public void testAbbr() {
        Assert.assertEquals(Utils.abbr("1234567890", 11), "1234567890");


    }
}

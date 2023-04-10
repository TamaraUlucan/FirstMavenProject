package org.redrower;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        testAbbr();
    }

    private static void testAbbr() {
        if (!"Hello...".equals(Utils.abbr("Hello world", 6))) {
            System.out.println("bug with 8 chars");
        }
        if (5 != Utils.sum(2,4)) {
            System.out.println("method sum has a bug");
        }
    }
}
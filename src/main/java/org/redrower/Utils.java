package org.redrower;

import org.apache.commons.lang3.StringUtils;

public class Utils {

    static String hi = "Hi, ";

    public static String abbr(String text, int length) {
        return StringUtils.abbreviate(text, length);
    }

    public static int sum (Integer first, int second) {
        int sum = first + second;

        return sum;
    }

    public static int sum(int firstValue, int secondValue, int thirdValue) {
        return firstValue + secondValue + thirdValue;
    }

    public static void printSum(int first, int second) {
        int s = sum(first, (Integer) second);
        System.out.println(hi + " sum = " + s);
    }

    void division(int first, int second) {
        double division = 1.0 * first / second;

        System.out.println("division = " + division);
    }

}

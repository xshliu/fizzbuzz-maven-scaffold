package com.xs.tdd;

public class FizzBuzz {
    public static String of(int in) {
        String s = Integer.toString(in);
        if (in % 3 == 0) {
            s = "Fizz";
        }
        if (in % 5 == 0) {
            s = "Fizz".equals(s) ? "FizzBuzz" : "Buzz";
        }
        return s;
    }
}

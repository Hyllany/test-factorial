package com.epam.rd.autotasks;

import java.util.stream.LongStream;

public class Factorial {
    public String factorial(String n) {
        if(Integer.parseInt(n) > 0){
            return getfac(Integer.parseInt(n));
        } else if(Integer.parseInt(n) == 0) {
            return "1";
        } else{
            throw new IllegalArgumentException();
        }
    }

    public static String getfac (int fac){
    int fact = 1;
        for (int i = 2; i <= fac; i++) {
        fact = fact * i;
        }
        return Integer.toString(fact) ;
    }
}

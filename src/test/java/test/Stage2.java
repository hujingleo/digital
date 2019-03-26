package test;

import org.junit.Test;

/**
 * Copyright (C), Su you technology co. LTD
 * FileName: Stage2.java
 * @author leo
 * @version 1.00
 * @Date 2019-03-25
 */
public class Stage2 {
    /**
     * a number is Fizz if it is divisible by 3 or if it has 3 in it;
     * a number is Buzz if it is divisible by 5 or if it has 5 in it;
     * a number is FizzBuzz if it satisfy above 2 criterias together.
     * Elapsed time (print1 to 100): 4ms
     * Elapsed time (print1 to 1000): 15ms
     * Elapsed time (print1 to 10000): 80ms
     */
    @Test
    public void printFizzBuzzPro() {
        try {
            for (int i = 1; i <= 100; i++) {
                String s = String.valueOf(i);
                if (i % 3 == 0 || s.contains("3")) {
                    if (i % 5 == 0 || s.contains("5")) {
                        System.out.println("FizzBuzz");
                    } else {
                        System.out.println("Fizz");
                    }
                } else if (i % 5 == 0 || s.contains("5")) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

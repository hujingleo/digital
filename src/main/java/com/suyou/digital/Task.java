package com.suyou.digital;

import org.junit.Test;

/**
 * Copyright (C), Su you technology co. LTD
 * FileName: Task.java
 *
 * @author leo
 * @version 1.00
 * @Date 2019-03-25
 */
public class Task {

    /**
     * 　　print numbers from 1 to 100,for the multiples of three print "Fizz" instead of the number and fro the multiples of five print "Buzz",
     *      For numbers which are multiples of both three and five print "FizzBuzz".
     */
    @Test
    public void printFizzBuzz() {
        try {
            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0) {
                    if (i % 5 == 0) {
                        System.out.println("FizzBuzz");
                    } else {
                        System.out.println("Fizz");
                    }
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 　　a number is Fizz if it is divisible by 3 or if it has 3 in it;
     *      a number is Buzz if it is divisible by 5 or if it has 5 in it;
     *      a number is FizzBuzz if it satisfy above 2 criterias together.
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

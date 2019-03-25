package com.suyou.digital;

import org.junit.Test;

/**
 * Copyright (C), Su you technology co. LTD
 * FileName: StageOne.java
 *
 * @author leo
 * @version 1.00
 * @Date 2019-03-25
 */
public class StageOne {

    /**
     * 　　* A class representing a set of packet and byte counters
     * 　　* It is observable to allow it to be watched, but only
     * 　　* reports changes when the current set is complete
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
     * 　　* A class representing a set of packet and byte counters
     * 　　* It is observable to allow it to be watched, but only
     * 　　* reports changes when the current set is complete
     */
    @Test
    public void printFizzBuzzPro() {
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

}

package com.suyou.digital;

import org.junit.Test;

/**
 * Copyright (C), Su you technology co. LTD
 * FileName: StageOne.java
 * @author leo
 * @Date    2019-03-25
 * @version 1.00
 */
public class StageOne {
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
}

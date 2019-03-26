package com.suyou.digital;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Copyright (C), Su you technology co. LTD
 * FileName: Stage1.java
 * This class contains five available methods
 * @author leo
 * @version 1.00
 * @Date 2019-03-25
 */
public class Stage1 {
    /**
     * print numbers from 1 to 100,for the multiples of three print "Fizz" instead of the number and fro the multiples of five print "Buzz",
     * for numbers which are multiples of both three and five print "FizzBuzz".
     * Elapsed time (print1 to 100): 4ms
     * Elapsed time (print1 to 1000): 14ms
     * Elapsed time (print1 to 10000): 85ms
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
     * print numbers from 1 to 100,for the multiples of three print "Fizz" instead of the number and fro the multiples of five print "Buzz",
     * for numbers which are multiples of both three and five print "FizzBuzz".
     * Elapsed time (print1 to 100): 4ms
     * Elapsed time (print1 to 1000): 14ms
     * Elapsed time (print1 to 10000): 85ms
     */
    @Test
    public void printFizzBuzzByStep() {
        int step3 = 1;
        int step5 = 1;
        try {
            for (int i = 1; i <= 100; i++) {
                if (step3 == 3 && step5 == 5) {
                    System.out.println("FizzBuzz");
                    step3 = 1;
                    step5 = 1;
                } else if (step3 == 3) {
                    System.out.println("Fizz");
                    step3 = 1;
                    step5++;
                } else if (step5 == 5) {
                    System.out.println("Buzz");
                    step3++;
                    step5 = 1;
                } else {
                    System.out.println(i);
                    step3++;
                    step5++;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * print numbers from 1 to 100,for the multiples of three print "Fizz" instead of the number and fro the multiples of five print "Buzz",
     * for numbers which are multiples of both three and five print "FizzBuzz".
     * Elapsed time (print1 to 100): 5ms
     * Elapsed time (print1 to 1000): 16ms
     * Elapsed time (print1 to 10000): 90ms
     */
    @Test
    public void printFizzBuzzByVector() {
        Vector<String> vector = new Vector<String>(100);
        try {
            for (int i = 1; i <= 100; i++) {
                vector.add("");
                if (i % 3 == 0) {
                    vector.setElementAt(vector.get(i - 1) + "Fizz", i - 1);
                }
                if (i % 5 == 0) {
                    vector.setElementAt(vector.get(i - 1) + "Buzz", i - 1);
                }
                if (vector.get(i - 1) == null || vector.get(i - 1) == "") {
                    vector.setElementAt(String.valueOf(i), i - 1);
                }
            }
            for (String s : vector) {
                System.out.println(s);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * print numbers from 1 to 100,for the multiples of three print "Fizz" instead of the number and fro the multiples of five print "Buzz",
     * for numbers which are multiples of both three and five print "FizzBuzz".
     * Elapsed time (print1 to 100): 5ms
     * Elapsed time (print1 to 1000): 17ms
     * Elapsed time (print1 to 10000): 95ms
     */
    @Test
    public void printFizzBuzzByVectorPro() {
        Vector<String> vector = new Vector<String>();
        try {
            for (int i = 1; i <= 100; i++) {
                String s = String.valueOf(i);
                vector.add(s);
            }
            for (int j = 1; (3 * j) <= 100; j++) {
                vector.setElementAt("Fizz", 3 * j - 1);
            }
            for (int k = 1; (5 * k) <= 100; k++) {
                if (5 * k % 3 == 0) {
                    vector.setElementAt(vector.get(5 * k - 1) + "Buzz", 5 * k - 1);
                } else {
                    vector.setElementAt("Buzz", 5 * k - 1);
                }
            }
            for (String s : vector) {
                System.out.println(s);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * print numbers from 1 to 100,for the multiples of three print "Fizz" instead of the number and fro the multiples of five print "Buzz",
     * for numbers which are multiples of both three and five print "FizzBuzz".
     * Elapsed time (print1 to 100): 4ms
     * Elapsed time (print1 to 1000): 16ms
     * Elapsed time (print1 to 10000): 90ms
     */
    @Test
    public void printFizzBuzzByArrayList() {
        List<String> list = new ArrayList<String>();
        try {
            for (int i = 1; i <= 100; i++) {
                list.add("");
                if (i % 3 == 0) {
                    list.set(i - 1, list.get(i - 1) + "Fizz");
                }
                if (i % 5 == 0) {
                    list.set(i - 1, list.get(i - 1) + "Buzz");
                }
                if (list.get(i - 1) == null || list.get(i - 1) == "") {
                    list.set(i - 1, String.valueOf(i));
                }
            }
            for (String s : list) {
                System.out.println(s);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}

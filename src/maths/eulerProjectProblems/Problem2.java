package maths.eulerProjectProblems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//https://projecteuler.net/problem=2
public class Problem2 {
    /*Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.*/

    public static void main(String[] args) {
//        int[] a = new int[10];
//        a[0] = 1;
//        a[1] = 2;
        int sum = 2;
        int first = 1;
        int second = 2;
        int fib = 0;
        while (fib < 4000000) {
            fib = first + second;
            System.out.println(fib);
            first = second;
            second = fib;
            if (fib % 2 == 0) {
                sum = sum + fib;
            }
        }
        System.out.println("Result " + sum);
//        for (int i : list) {
//            System.out.println(i);
//        }
    }
}

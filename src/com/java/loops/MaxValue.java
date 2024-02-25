package com.java.loops;

import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int maxValue = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int numbers = scanner.nextInt();

            if (numbers > maxValue) {
                maxValue = numbers;
            }
        }
        System.out.println(maxValue);
    }
}

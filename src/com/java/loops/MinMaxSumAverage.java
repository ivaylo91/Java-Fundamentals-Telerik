package com.java.loops;

import java.util.Scanner;

public class MinMaxSumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double average = 0;
        double min = 10000;
        double max = -10000;
        double sum = 0;

        for (int i = 0; i < n; i++) {
            double numbers = scanner.nextDouble();

            if (numbers < min) {
                min = numbers;
            }
            if (numbers > max) {
                max = numbers;
            }
            sum += numbers;
        }
        average = sum / n;

        System.out.printf("min=%.2f%n", min);
        System.out.printf("max=%.2f%n", max);
        System.out.printf("sum=%.2f%n", sum);
        System.out.printf("avg=%.2f", average);

    }
}

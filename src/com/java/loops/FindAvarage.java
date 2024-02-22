package com.java.loops;

import java.util.Scanner;

public class FindAvarage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum = 0;
        double average;

        for (int i = 0; i < n; i++) {
            double numbers = scanner.nextDouble();
            sum += numbers;
        }
        average = sum / n;
        System.out.printf("%.2f", average);
    }
}

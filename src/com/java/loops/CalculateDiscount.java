package com.java.loops;

import java.util.Scanner;
import java.util.function.DoubleFunction;

public class CalculateDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double discount = 0;
        double finalPrice = 0;
        for (int i = 0; i < n; i++) {
            double prices = scanner.nextDouble();
            discount = prices * 0.65;
            finalPrice = prices - discount;

            System.out.printf("%.2f%n", finalPrice);
        }
    }
}

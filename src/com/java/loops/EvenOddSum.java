package com.java.loops;

import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int evenProduct = 1;
        int oddProduct = 1;

        for (int i = 1; i <= n; i++) {
            int numbers = scanner.nextInt();

            if (i % 2 == 1) {
                oddProduct *= numbers;
            } else {
                evenProduct *= numbers;
            }
        }
        if (evenProduct == oddProduct) {
            System.out.printf("yes %d", evenProduct);
        } else {
            System.out.printf("no %d %d", oddProduct, evenProduct);
        }
    }
}


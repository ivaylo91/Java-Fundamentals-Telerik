package com.java.loops;

import java.util.Scanner;

public class NotDivisibleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                continue;
            } else if (i % 7 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}

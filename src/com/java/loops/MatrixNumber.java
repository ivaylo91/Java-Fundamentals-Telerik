package com.java.loops;

import java.util.Scanner;

public class MatrixNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        int N = Integer.parseInt(number);
        for (int i = 1; i <= N; i++)
        {
            int j;
            for (j = i; j <= N; j++)
            {
                System.out.print(j + " ");
            }
            for(int k = i-1; k >= 1; k--)
            {
                System.out.print(j + " ");
                j++;

            }
            System.out.println();
        }
    }
}

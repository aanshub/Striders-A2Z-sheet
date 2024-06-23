package org.learning.patterns;

import java.util.Scanner;

/*
for size = 3
******
**  **
*    *
*    *
**  **
******
*/
public class Pattern19 {

    public static void main(String[] args) {
        int size = 0;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter size of patten required: ");
            size = scan.nextInt();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        printPattern(size);
    }

    private static void printPattern(int size) {

        printTopHalf(size);
        printBottomHalf(size);
    }

    private static void printTopHalf(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (i - 1); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= size - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printBottomHalf(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (size - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}

package org.learning.patterns;

import java.util.Scanner;

/*

for size = 4
   A
  ABA
 ABCBA
ABCDCBA

*/
public class Pattern17 {

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
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }

            char c = 'A';
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(c);
                if (j < i) {
                    c++;
                } else {
                    c--;
                }

            }

            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}

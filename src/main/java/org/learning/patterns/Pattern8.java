package org.learning.patterns;

import java.util.Scanner;

/*

for size = 3

*****
 ***
  *

*/
public class Pattern8 {

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
        for (int i = size; i >= 1; i--) {

            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

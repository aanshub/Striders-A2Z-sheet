package org.learning.patterns;

/*

for n = 3
******
******
******

*/

import java.util.Scanner;

public class Pattern1 {

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
            for (int j = 1; j <= size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

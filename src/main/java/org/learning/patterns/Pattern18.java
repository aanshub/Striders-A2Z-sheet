package org.learning.patterns;

import java.util.Scanner;

/*

for size = 5
E
DE
CDE
BCDE
ABCDE
*/
public class Pattern18 {

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
        char c = (char) ('A' + size - 1);
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (c + j - 1));
            }
            c--;
            System.out.println();
        }

    }

}

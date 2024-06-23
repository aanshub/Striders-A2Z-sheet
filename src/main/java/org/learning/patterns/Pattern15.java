package org.learning.patterns;

import java.util.Scanner;

/*

for size = 5
ABCDE
ABCD
ABC
AB
A

*/
public class Pattern15 {

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
            for (char c = 'A'; c <= 'A' + i - 1; c++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}

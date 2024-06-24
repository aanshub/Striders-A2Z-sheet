package org.learning.patterns;

import java.util.Scanner;

/*
for size = 3
33333
32223
32123
32223
33333
*/
public class Pattern22 {

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

        for (int i = 1; i <= 2 * size - 1; i++) {
            for (int j = 1; j <= 2 * size - 1; j++) {
                int diff = Math.max(Math.abs(size - j), Math.abs(size - i));
                System.out.print(1 + diff);
            }
            System.out.println();
        }

    }
}

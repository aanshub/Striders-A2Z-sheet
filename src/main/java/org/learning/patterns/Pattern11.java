package org.learning.patterns;
/*

for size = 5

1
01
101
0101
10101

*/

import java.util.Scanner;

public class Pattern11 {

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
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}

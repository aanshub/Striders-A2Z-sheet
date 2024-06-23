package org.learning.patterns;

import java.util.Scanner;

/*

for size = 5
A
BB
CCC
DDDD
EEEEE

*/
public class Pattern16 {

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
        char c = 'A';
        for (int i = 1; i <= size; i++, c++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }


}

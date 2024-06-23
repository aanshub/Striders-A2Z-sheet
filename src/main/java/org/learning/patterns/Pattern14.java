package org.learning.patterns;
/*

for size = 5
A
AB
ABC
ABCD
ABCDE

*/

import java.util.Scanner;

public class Pattern14 {

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
        for(int i =1; i<= size; i++) {
            char c = 'A';
            for(int j = 1; j <= i; j++,c++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}

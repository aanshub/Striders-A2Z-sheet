package org.learning.patterns;


/*

for size = 4

1
23
345
6789


*/

import java.util.Scanner;

public class Pattern13 {

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
        int counter = 1;
        for(int i = 1; i<= size; i++) {
            for(int j = 1; j<=i; j++,counter++) {
                System.out.print(counter + " ");
            }
            System.out.println();
        }
    }

}

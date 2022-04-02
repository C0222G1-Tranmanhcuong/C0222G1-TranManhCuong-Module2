package _02_loop_array_java.exercise_loop;

import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the rectangle");
        System.out.println("2. Draw the square triangle ");
        System.out.println("3.Draw the isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice");
        choice = input.nextInt();
        switch (choice) {
            case 1:


                System.out.println("Draw the rectangle");
                int height;
                int width;
                int i;
                System.out.print("height = ");
                height = input.nextInt();
                System.out.print("width = ");
                width = input.nextInt();
                for (i = 1; i <= height; i++) {
                    for (int j = 1; j <= width; j++) {
                        System.out.print("*  ");
                    }
                    System.out.println("");
                }
                break;

            case 2:


                System.out.print("height = ");
                height = input.nextInt();
                System.out.println("Draw the square triangle ");
                for (i = 1; i <= height; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                System.out.println("\n");

                for (i = height; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
                System.out.println("\n");

                for (i = 0; i < height; i++) {
                    for (int j = i; j < height - 1; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

                System.out.println("\n");

                for (i = 0; i < height; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = i; j < height; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 3:
                System.out.println("height = ");
                height = input.nextInt();
                System.out.println("Draw the isosceles triangle");
                for (i = 1; i <= height; i++) {
                    for (int k = height; k > i; k--) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= i * 2 - 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");

                }
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
    }

}

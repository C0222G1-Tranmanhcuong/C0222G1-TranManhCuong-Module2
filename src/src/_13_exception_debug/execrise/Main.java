package _13_exception_debug.execrise;

import java.util.Scanner;

public class Main {
    public static void checkTriangle(double a, double b, double c) throws IllegalTriangleExceptionClass {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleExceptionClass("Độ dài ba cạnh nhỏ hơn 0 thì không phải là cạnh của tam giác!");
        }
        if (a + b < c || a + c < b || b + c < a) {
            throw new IllegalTriangleExceptionClass("Tổng độ dài hai cạnh không " +
                    "lớn hơn cạnh còn lại thì không phải cạnh của tam giác");
        } else {
            System.out.println(" Ba cạnh là một tam giác");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean check = true;
        while (check) {
            try {
                check = false;
                System.out.println("Nhập độ dài cạnh a: ");
                double a = Double.parseDouble(input.nextLine());

                System.out.println(" Nhập độ dài cạnh b: ");
                double b = Double.parseDouble(input.nextLine());

                System.out.println(" Nhập độ dài cạnh c: ");
                double c = Double.parseDouble(input.nextLine());

                checkTriangle(a, b, c);
            } catch (NumberFormatException e) {
                System.err.println("Nhập lại độ dài cạnh bằng chữ số:  ");
                check = true;

            } catch (IllegalTriangleExceptionClass e) {
                System.out.println(e.getMessage());
                check = true;

            }

        }
    }

}

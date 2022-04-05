package _03_class_and_object_in_java.exercise.build_class_quadratic_equation;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }


    public double getB() {
        return b;
    }


    public double getC() {
        return c;
    }


    public double Discriminant() {
        return (Math.pow(b, 2)) - (4 * a * c);
    }

    public double root1() {
        return (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
    }

    public double root2() {
        return (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
    }

    public double root3() {
        return -b / 2 * a;
    }

    public double root4() {
        return 1;
    }

    public double root5() {
        return c / a;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Nhap so a: ");
        double a = input.nextDouble();
        System.out.print(" Nhap so b: ");
        double b = input.nextDouble();
        System.out.print(" Nhap so c: ");
        double c = input.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.Discriminant() == 0) {
            System.out.print("Phuong trinh co nghiem kep =: " + quadraticEquation.root3());
        } else if (quadraticEquation.Discriminant() > 0) {
            System.out.println("Phuong trinh co hai nghiem: " + "x1= " + quadraticEquation.root1() + "\n" + "x2= "
                    + quadraticEquation.root2());
        } else if (quadraticEquation.Discriminant() < 0) {
            System.out.print(" Phuong trinh vo nghiem ");
        } else if ((quadraticEquation.a + quadraticEquation.b + quadraticEquation.c) == 0) {
            System.out.println("Phuong trinh co hai nghiem: " + "x1= " + quadraticEquation.root4() + "\n" + "x2= "
                    + quadraticEquation.root5());

        }
    }
}




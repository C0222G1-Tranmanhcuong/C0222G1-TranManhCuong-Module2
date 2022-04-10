package _01_introduction_Java.exercise;

import java.util.Scanner;

public class ReadNumbersIntoLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Số bạn cần đọc: ");
        int input;
        input = sc.nextInt();
        int unit = input % 10;
        int dozens = (input / 10) % 10;
        int hundred = (input / 100) % 10;
        String display1 = "";
        String display2 = "";
        String display3 = "";
        if (unit >= 0) {
            switch (unit) {
                case 0:
                    display1 = "";
                    break;
                case 1:
                    display1 = "one";
                    break;
                case 2:
                    display1 = "two";
                    break;
                case 3:
                    display1 = "three";
                    break;
                case 4:
                    display1 = "four";
                    break;
                case 5:
                    display1 = "five";
                    break;
                case 6:
                    display1 = "six";
                    break;
                case 7:
                    display1 = "seven";
                    break;
                case 8:
                    display1 = "eight";
                    break;
                case 9:
                    display1 = "nine";
                    break;

            }
            if (dozens == 1) {
                switch (unit) {
                    case 0:
                        display2 = " ten ";
                        break;
                    case 1:
                        display2 = " eleven ";
                        break;
                    case 2:
                        display2 = " twelve ";
                        break;
                    case 3:
                        display2 = " Thirteen ";
                        break;
                    case 4:
                        display2 = " fourteen ";
                        break;
                    case 5:
                        display2 = " fifteen ";
                        break;
                    case 6:
                        display2 = " sixteen ";
                        break;
                    case 7:
                        display2 = " seventeen";
                        break;
                    case 8:
                        display2 = " eighteen";
                        break;
                    case 9:
                        display2 = " nineteen";
                        break;
                }
            } else {
                switch (dozens) {
                    case 2:
                        display2 = " twenty ";
                        break;
                    case 3:
                        display2 = " thirty ";
                        break;
                    case 4:
                        display2 = " forty ";
                        break;
                    case 5:
                        display2 = " fifty ";
                        break;
                    case 6:
                        display2 = " sixty ";
                        break;
                    case 7:
                        display2 = " seventy ";
                        break;
                    case 8:
                        display2 = " eighty ";
                        break;
                    case 9:
                        display2 = " ninety ";
                        break;
                }
            }
            switch (hundred) {
                case 1:
                    display3 = " One hundred ";
                    break;
                case 2:
                    display3 = " Two hundred ";
                    break;
                case 3:
                    display3 = " Three hundred ";
                    break;
                case 4:
                    display3 = " Four hundred ";
                    break;
                case 5:
                    display3 = " Five hundred ";
                    break;
                case 6:
                    display3 = " Six hundred  ";
                    break;
                case 7:
                    display3 = " Seven hundred ";
                    break;
                case 8:
                    display3 = " Eight hundred ";
                    break;
                case 9:
                    display3 = " Nine hundred ";
                    break;
            }
            if (dozens == 1) {
                System.out.print(" Bạn vừa nhập số: " + input + "=" + display3 + " " + display2);
            } else if (dozens == 0) {
                System.out.print(" Bạn vừa nhập số: " + display3);
            } else {
                System.out.print("Bạn vừa nhập số: " + input + "=" + display3 + " and " + display2 + display1);


            }
        }
    }
}

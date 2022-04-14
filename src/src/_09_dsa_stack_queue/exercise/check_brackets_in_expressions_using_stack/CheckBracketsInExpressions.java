package _09_dsa_stack_queue.exercise.check_brackets_in_expressions_using_stack;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracketsInExpressions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Character> bStack = new Stack<>();
        System.out.println("Nhập vào biểu thức: ");
        String str = input.nextLine();
        char left = ' ';
        boolean check = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                bStack.push(str.charAt(i));
            } else if (str.charAt(i) == ')') {
                if (bStack.isEmpty()) {
                    check = true;
                } else {
                    left = bStack.pop();
                }
                if (left != '(') {
                    check = true;
                }
            }
        }
        if (bStack.isEmpty()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }


}

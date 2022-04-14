package _09_dsa_stack_queue.exercise.DecimalToBinary;

import java.util.Scanner;
import java.util.Stack;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println(" Nhập số thập phân muốn chuyển đổi: ");
        int decimal = input.nextInt();
        while (decimal != 0) {
            int a = (decimal % 2);
            stack.push(a);
            decimal = decimal / 2;

        }
        while (!(stack.isEmpty())) {
            System.out.print(stack.pop());

        }
    }
}

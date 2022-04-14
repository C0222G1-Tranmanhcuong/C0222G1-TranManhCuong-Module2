package _09_dsa_stack_queue.exercise.checking_palindrome_strings_using_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class CheckingPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chuỗi muốn kiểm tra: ");
        String str = input.nextLine();
        String[] array;
        array = str.split("");
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        for (int i = 0, j = str.length() - 1; i < str.length(); i++, j--) {
            stack.push(array[i].toLowerCase());
            queue.add(array[j].toLowerCase());
        }
        if (stack.equals(queue)) {
            System.out.println("Đây là chuỗi Palindrome");
        } else {
            System.out.println("Đây không phải là chuỗi Palindrome");
        }

    }
}

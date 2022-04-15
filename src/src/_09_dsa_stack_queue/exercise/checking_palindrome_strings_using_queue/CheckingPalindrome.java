package _09_dsa_stack_queue.exercise.checking_palindrome_strings_using_queue;

import java.util.*;

public class CheckingPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chuỗi muốn kiểm tra: ");
        String str = input.nextLine();
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        str = str.toLowerCase().replaceAll(" ", "");
        String[] arrStr = str.split("");
        System.out.println(Arrays.toString(arrStr));
        for (int i = 0; i < arrStr.length; i++) {
            queue.add(arrStr[i]);
            stack.push(arrStr[i]);
        }
        String result = "";
        while (!queue.isEmpty()) {
            if (queue.remove().equals(stack.pop())) {
                result = "Đaay là chuỗi palindrome";
            } else {
                result = "Đây không phải là chuỗi palindrome";
                break;
            }
        }
        System.out.println(result);
    }
}

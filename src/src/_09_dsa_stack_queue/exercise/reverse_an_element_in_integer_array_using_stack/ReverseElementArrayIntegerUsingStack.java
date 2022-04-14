package _09_dsa_stack_queue.exercise.reverse_an_element_in_integer_array_using_stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseElementArrayIntegerUsingStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stackInteger = new Stack<>();
        System.out.println("Nhap size:");
        int n = sc.nextInt();
        int integer[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu vao mang: ");
            stackInteger.push(sc.nextInt());
        }
        System.out.println("Mang so nguyen ban dau: " + stackInteger);

        for (int i = 0; i < n; i++) {
            integer[i] = stackInteger.pop();
        }
        System.out.println(" Mang so nguyen sau khi dao nguoc: " + Arrays.toString(integer));
    }


}

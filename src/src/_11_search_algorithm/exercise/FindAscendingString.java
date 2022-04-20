package _11_search_algorithm.exercise;

import java.util.LinkedList;
import java.util.Scanner;

public class FindAscendingString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi: ");
        String str = input.nextLine();
        LinkedList<Character> list = new LinkedList<>();
        list.add(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) > list.getLast()) {
                list.add(str.charAt(i));

            }
        }
        for (Character item : list) {
            System.out.println(item);

        }


    }
}



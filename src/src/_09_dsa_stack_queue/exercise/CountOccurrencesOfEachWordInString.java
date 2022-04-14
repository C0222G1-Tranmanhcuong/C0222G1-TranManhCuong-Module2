package _09_dsa_stack_queue.exercise;

import java.util.Scanner;
import java.util.TreeMap;

public class CountOccurrencesOfEachWordInString {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập chuỗi bất kì: ");
        String string = input.nextLine().toLowerCase();
        String[] newString = string.split(" ");
        int count = 1;
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        for (int i = 0; i < newString.length; i++) {
            if (treeMap.containsKey(newString[i])) {
                treeMap.put(newString[i], treeMap.get(newString[i]) + 1);
            } else {
                treeMap.put(newString[i], 1);
            }
        }
        System.out.println(treeMap);

    }
}

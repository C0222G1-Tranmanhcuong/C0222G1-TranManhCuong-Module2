package _02_loop_array_java.exercise_array;

import java.util.Scanner;

public class CountCharacterString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s;
        System.out.print("Nhap chuoi bat ky: ");
        s = input.nextLine();
        char a;
        System.out.print("Nhap mot ky tu: ");
        a = input.next().charAt(0);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == a) {
                count++;
            }
        }
        System.out.print("So lan xuat hien cua " + a + " la: " + count);

    }
}

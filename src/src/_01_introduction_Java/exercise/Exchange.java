package _01_introduction_Java.exercise;

import java.util.Scanner;

public class Exchange {
    public static void main(String[] args) {
        long vnd = 23000;
        long usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền USD: " + "$");
        usd = scanner.nextLong();
        long quydoi = usd * vnd;
        System.out.print("Giá trị VND là: " + quydoi + " vnd");

    }
}

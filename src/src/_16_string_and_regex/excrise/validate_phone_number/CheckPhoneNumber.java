package _16_string_and_regex.excrise.validate_phone_number;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckPhoneNumber {
    private static final String PHONENUMBER_REGEX = "^[(][\\d]{2}[)]-[(](0)[(\\d)]{9}[)]$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số điện thoại: ");
        String phoneNumber = scanner.nextLine();
        boolean validatePhoneNumber = Pattern.matches(PHONENUMBER_REGEX, phoneNumber);
        System.out.println(validatePhoneNumber);
    }
}


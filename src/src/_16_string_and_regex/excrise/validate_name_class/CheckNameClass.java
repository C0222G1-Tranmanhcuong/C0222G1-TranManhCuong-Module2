package _16_string_and_regex.excrise.validate_name_class;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckNameClass {
    private static final String CLASSNAME_REGEX = "^[ACP][\\d]{4}[GHIKLM]$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập tên lớp học: ");
        String str = scanner.nextLine();
        boolean validateClass = Pattern.matches(CLASSNAME_REGEX, str);
        System.out.println(validateClass);

    }
}

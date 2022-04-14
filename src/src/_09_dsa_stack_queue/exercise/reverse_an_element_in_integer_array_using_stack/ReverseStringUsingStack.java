package _09_dsa_stack_queue.exercise.reverse_an_element_in_integer_array_using_stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseStringUsingStack {

//       ĐẢO NGƯỢC TỪ
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chuỗi bất kỳ: ");
        String str1 = input.nextLine();
        String str2 = " ";
        String[] charArray = new String[str1.length()];

        charArray = str1.split("");
        System.out.println(Arrays.toString(charArray));
        Stack<String> stackString = new Stack<>();

        for (int i = 0; i < charArray.length; i++) {
            stackString.push(charArray[i]);
        }

        for (int i = 0; i < charArray.length; i++) {
            str2 += stackString.pop();
            str2 += " ";
        }
        System.out.println(str2);
    }








//      ĐẢO NGƯỢC TỪNG KÍ TỰ TRONG CHUỖI SỬ DỤNG HÀM REVERSE


//    public static String reverse(String str){
//
//        // Tạo một stack trống
//        Stack<Character> stackString = new Stack<>();
//
//        // Đẩy tất cả các kí tự trong chuỗi vào stack
//        char[] string = str.toCharArray();
//        for (int i = 0; i < str.length(); i++) {
//            stackString.push(string[i]);
//        }
//
//        int index = 0;
//        while (!stackString.isEmpty()){
//            string[index++] = stackString.pop();
//        }
//        return String.copyValueOf(string);
//
//    }
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String s;
//        System.out.print("Nhap chuoi bat ky: ");
//        s = input.nextLine();
//
//        s = reverse(s);
//        System.out.println(" Chuoi duoc dao nguoc la : " +s);
//    }
}

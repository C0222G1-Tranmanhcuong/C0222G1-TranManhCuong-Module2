package _02_loop_array_java.exercise_loop;

public class Print20FirstPrimeNumber {
    public static void main(String[] args) {
        int numbers = 20;
        int count = 0;
        int n = 2;
        while (count < numbers) {
            int k = 0;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    k++;
                }
            }
            if (k == 0) {
                System.out.println(n + " is the a prime number");
                count++;
            }
            n++;
        }

    }
}


// Bài tham khảo của a Duy:


//        int number = 0;
//        int count = 0;
//        while (count < 20) {
//            boolean check = true;
//            if (number < 2) {
//                check = false;
//            } else {
//                for (int i = 2; i < number; i++) {
//                    if (number % i == 0) {
//                        check = false;
//                        break;
//                    }
//                }
//                if (check) {
//                    System.out.println(number + " is the a prime number");
//                    count++;
//                }
//            }
//            number++;
//        }

//    }
//}

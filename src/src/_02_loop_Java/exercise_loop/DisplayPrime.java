package _02_loop_Java.exercise_loop;

public class DisplayPrime {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int numbers;
//        int count = 0;
//        int n = 2;
//        System.out.println("Input numbers: ");
//        numbers = input.nextInt();
//        while (count <numbers) {
//            int k = 0;
//            for (int i = 2; i < n; i++) {
//                if (n % i == 0) {
//                    k++;
//                }
//                }
//            if (k == 0) {
//                System.out.print(n+" ");
//                count++;
//            }
//            n++;
//        }
//
//    }
        int number = 0;
        int count = 0;
        while (count < 20) {
            boolean check = true;
            if (number < 2) {
                check = false;
            } else {
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    System.out.println(number + " is the a prime number");
                    count++;
                }
            }
            number++;
        }

    }
}

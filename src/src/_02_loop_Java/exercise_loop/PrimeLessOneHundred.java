package _02_loop_Java.exercise_loop;

public class PrimeLessOneHundred {
    public static void main(String[] args) {
        int n = 0;
        while (n < 100) {
            boolean check = true;
            if (n < 2) {
                check = false;
            } else {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    System.out.println(n + " is the a prime number");
                }
            }
            n++;
        }
    }
}

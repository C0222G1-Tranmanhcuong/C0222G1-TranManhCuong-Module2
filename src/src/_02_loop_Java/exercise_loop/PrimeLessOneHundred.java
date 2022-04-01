package _02_loop_Java.exercise_loop;

public class PrimeLessOneHundred {
    public static void main(String[] args) {
        int numbers = 2;
        while (numbers < 100) {
            int k = 0;
            for (int i = 2; i < numbers; i++) {
                if (numbers % i == 0) {
                    k++;
                }
            }
            if (k == 0) {
                System.out.println(numbers + " is the a prime number ");
            }
            numbers++;

        }

    }
}


package _03_class_and_object_in_java.exercise.build_class_stop_watch;

import _03_class_and_object_in_java.exercise.build_class_stop_watch.StopWatch;

import java.util.Arrays;

public class StopWatch1 {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println("Thoi gian bat dau: " + stopWatch.getStartTime());
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) +Math.floor(Math.random() * 100000);
        }

        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            for (int j = i; j < arr.length - i; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    arr[j]= arr[i];
                    arr[i] = min;

                }
            }

        }
        stopWatch.stop();
        System.out.println(Arrays.toString(arr));
        System.out.println("Thoi gian ket thuc: " + stopWatch.getEndTime());
        System.out.println("Thoi gian da troi qua: " + stopWatch.getElapsedTime() + " Milisecod giay ");
    }
}

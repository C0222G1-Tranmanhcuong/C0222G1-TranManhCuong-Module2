package _03_class_and_object_in_java.exercise.build_class_fan;

public class Main {
    public static void main(String[] args) {
        Fan buildClassFan1 = new Fan();
        buildClassFan1.Fan(3,10,"yellow",true);
        Fan buildClassFan2 = new Fan();
        buildClassFan2.Fan(1,5,"Blue",false);
        System.out.println(buildClassFan1);
        System.out.println(buildClassFan2);
    }
}

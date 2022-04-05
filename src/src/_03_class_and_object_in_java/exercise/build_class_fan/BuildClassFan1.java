package _03_class_and_object_in_java.exercise.build_class_fan;

import _03_class_and_object_in_java.exercise.build_class_fan.BuildClassFan;

public class BuildClassFan1 {
    public static void main(String[] args) {
        BuildClassFan buildClassFan1 = new BuildClassFan();
        buildClassFan1.Fan(3,10,"yellow",true);
        BuildClassFan buildClassFan2 = new BuildClassFan();
        buildClassFan2.Fan(1,5,"Blue",false);
        System.out.println(buildClassFan1);
        System.out.println(buildClassFan2);
    }
}

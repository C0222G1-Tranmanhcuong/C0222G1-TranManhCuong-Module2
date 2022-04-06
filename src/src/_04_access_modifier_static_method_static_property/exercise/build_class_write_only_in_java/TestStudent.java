package _04_access_modifier_static_method_static_property.exercise.build_class_write_only_in_java;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setClasses("C03");
        System.out.println(student.getClasses());
        student.setName("Cuong");
        System.out.println(student.getName());
    }
}

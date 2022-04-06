package _04_access_modifier_static_method_static_property.exercise.build_class_write_only_in_java;

public class Student {
    private String name = "Jonh";
    private String classes = "C02";

        public Student(){

        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

}

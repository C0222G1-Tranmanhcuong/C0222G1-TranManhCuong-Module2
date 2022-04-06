package _04_access_modifier_static_method_static_property.demo;

public class Student1 {
    private String name;
    private int age;
    private String address;
    private int point;

    public Student1(String name, int age, String address, int point) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;

    }

    @Override
    public String toString() {
        return "Student: " +
                "name='" + name + '\'' +
                ", age= '" + age +'\''+
                ", address='" + address + '\'' +
                ", point= " + point +"."+
                 "\n";
    }
}

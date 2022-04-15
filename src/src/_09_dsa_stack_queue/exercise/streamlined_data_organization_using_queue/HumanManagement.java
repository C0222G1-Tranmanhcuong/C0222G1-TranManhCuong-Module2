package _09_dsa_stack_queue.exercise.streamlined_data_organization_using_queue;

public class HumanManagement implements Comparable<HumanManagement> {
    private String name;
    private int age;
    private boolean gender;

    public HumanManagement(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
    @Override
    public int compareTo(HumanManagement o) {
        if (age > o.age) {
            return -1;
        } else if (age < o.age) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Name= " + name + '\'' +
                ", Age=" + age +
                ", Gender=" + gender + "\n" ;
    }
}

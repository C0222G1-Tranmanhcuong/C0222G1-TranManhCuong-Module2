package case_study_module2.models;

public class Employee extends Person {
    private int employeeId;
    private String gender;
    private int phoneNumber;
    private String email;
    private String level;
    private String position;
    private double salary;

    public Employee() {

    }

    public Employee(int id, String name,
                    int age, String address,
                    int employeeId, String gender,
                    int phoneNumber, String email,
                    String level, String position,
                    double salary) {
        super(id, name, age, address);
        this.employeeId = employeeId;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: " +
                " id: "+ super.getId()+ ", name: " + super.getName()+
                ", age: " + super.getAge()+ ", address: " + super.getAddress()+
                "employeeId=" + employeeId +
                ", gender='" + gender +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email +
                ", level='" + level +
                ", position='" + position +
                ", salary=" + salary ;
    }
}

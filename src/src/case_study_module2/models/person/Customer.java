package case_study_module2.models;

public class Customer extends  Person{
    private int customerId;
    private String gender;
    private int phoneNumber;
    private String email;
    private String customerLevel;

    public Customer() {
    }

    public Customer(int id,
                    String name, int age, String address,
                    int customerId, String gender, int phoneNumber,
                    String email, String customerLevel) {
        super(id, name, age, address);
        this.customerId = customerId;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customerLevel = customerLevel;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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

    public String getCustomerLevel() {
        return customerLevel;
    }

    public void setCustomerLevel(String customerLevel) {
        this.customerLevel = customerLevel;
    }

    @Override
    public String toString() {
        return "Customer: " + " Id: "+ super.getId()+
                ", customerId: " + customerId +
                ", name: "+ super.getName()+ ", age: "+ super.getAge()+
                ", address: "+ super.getAddress()+
                ", gender: " + gender  +
                ", phoneNumber: " + phoneNumber +
                ", email: " + email +
                ", customerLevel: " + customerLevel ;
    }
}

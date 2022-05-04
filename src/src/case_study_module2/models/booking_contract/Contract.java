package case_study_module2.models.booking_contract;

import case_study_module2.models.person.Customer;

public class Contract {
    private String id;
    private Booking booking;
    private String depositMoney;
    private String totalPayment;
    private Customer Customer;

    public Contract() {
    }

    public Contract(String id, Booking booking, String depositMoney, String totalPayment,
                    Customer customer) {
        this.id = id;
        this.booking = booking;
        this.depositMoney = depositMoney;
        this.totalPayment = totalPayment;
        Customer = customer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public String getDepositMoney() {
        return depositMoney;
    }

    public void setDepositMoney(String depositMoney) {
        this.depositMoney = depositMoney;
    }

    public String getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(String totalPayment) {
        this.totalPayment = totalPayment;
    }

    public case_study_module2.models.person.Customer getCustomer() {
        return Customer;
    }

    public void setCustomer(case_study_module2.models.person.Customer customer) {
        Customer = customer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "id='" + id + '\'' +
                ", booking=" + booking +
                ", depositMoney='" + depositMoney + '\'' +
                ", totalPayment='" + totalPayment + '\'' +
                ", Customer=" + Customer +
                '}';
    }
}

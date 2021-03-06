package case_study_module2.models.booking_contract;

import case_study_module2.models.facility.Facility;
import case_study_module2.models.person.Customer;

public class Booking {
    private int id;
    private String startDay;
    private String endDay;
    private Customer customer;
    private Facility facility;


    public Booking() {
    }

    public Booking(int id, String startDay, String endDay, Customer customer, Facility facility) {
        this.id = id;
        this.startDay = startDay;
        this.endDay = endDay;
        this.customer = customer;
        this.facility = facility;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }


    @Override
    public String toString() {
        return "Booking: " +
                " id=" + id +
                ", startDay: " + startDay +
                ", endDay: " + endDay +
                ", customer: " + customer +
                ", facility: " + facility ;
    }
}

package case_study_module2.service.Implement;

import case_study_module2.models.booking_contract.Booking;
import case_study_module2.models.facility.Facility;
import case_study_module2.models.person.Customer;
import case_study_module2.service.BookingService;
import case_study_module2.utils.BookingComparator;

import java.util.*;

public class BookingServiceIplm  implements BookingService {

        static Set<Booking>bookingSet = new TreeSet<>(new BookingComparator());

        static List<Customer>customerList = new ArrayList<>();
        static Map<Facility,Integer>facilityIntegerMap = new LinkedHashMap<>();

    @Override
    public void displayBookingList() {

    }

    @Override
    public void addBooking() {


    }

    @Override
    public void display() {

    }

    @Override
    public void addNew() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}

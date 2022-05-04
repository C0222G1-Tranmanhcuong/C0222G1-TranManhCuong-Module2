package case_study_module2.service.Implement;

import case_study_module2.models.booking_contract.Booking;
import case_study_module2.models.facility.Facility;
import case_study_module2.models.facility.Villa;
import case_study_module2.models.person.Customer;
import case_study_module2.service.BookingService;
import case_study_module2.utils.BookingComparator;
import case_study_module2.utils.RegexData;

import java.util.*;

public class BookingServiceIplm  implements BookingService {
    static Scanner scanner = new Scanner(System.in);


    static Set<Booking>bookingSet = new TreeSet<>(new BookingComparator());

        static List<Customer>customerList = new ArrayList<>();
        static Map<Facility,Integer>facilityIntegerMap = new LinkedHashMap<>();



    public Set<Booking> sendBooking(){
        return bookingSet;
    }

    @Override
    public void displayBookingList() {
        for (Booking booking : bookingSet) {
            System.out.println(booking);
        }

    }

    @Override
    public void addBooking() {
        int id = 1;
        if (!bookingSet.isEmpty()){
            id = bookingSet.size();
        }
        Customer customer = chooseCustomer();
        Facility facility = chooseFacility();
        System.out.println("Nhập ngày bắt đầu thuê: ");
        String startDate = scanner.nextLine();
        System.out.println("Nhập ngày trả phòng: ");
        String endDate = scanner.nextLine();
        Booking booking = new Booking(id,startDate,endDate,customer,facility);

        bookingSet.add(booking);
        System.out.println("Tạo mới thành công! ");

    }

    @Override
    public void display() {
    }



    public static Customer chooseCustomer(){
        System.out.println("Danh sách khách hàng: ");
        for (Customer customer : customerList){
            System.out.println(customer.toString());
        }

        System.out.println("Nhập ID khách hàng: ");
        boolean check = true;
        int id = Integer.parseInt(scanner.nextLine());

        while (check){
            for (Customer customer : customerList) {
                if (id == customer.getId()){
                    check = false;
                    return customer;
                }
            }
            if (check){
                System.out.println("Vui lòng nhập lại ID khách hàng: ");
                id = Integer.parseInt(scanner.nextLine());
            }
        }
        return null;
    }

    public static Facility chooseFacility(){
        System.out.println("Danh sách dịch vụ: ");
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()){
            System.out.println(entry.getKey().toString());
        }

        System.out.println("Nhập ID dịch vụ: ");
        boolean check = true;
        String id = scanner.nextLine();

        while (check){
            for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
                if (id.equals(entry.getKey().getIdFacility())){
                    return entry.getKey();
                }
            }
            if (check){
                System.out.println("Vui lòng nhập lại ID dịch vụ: ");
                id = scanner.nextLine();
            }
        }
        return null;
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

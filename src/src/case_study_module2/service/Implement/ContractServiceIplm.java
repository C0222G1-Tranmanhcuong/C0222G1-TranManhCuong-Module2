package case_study_module2.service.Implement;

import case_study_module2.models.booking_contract.Booking;
import case_study_module2.models.booking_contract.Contract;
import case_study_module2.models.person.Customer;
import case_study_module2.service.ContractService;

import java.util.*;

public class ContractServiceIplm implements ContractService {

    static List<Contract> contractList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void creatNewContract() {
        Queue<Booking> bookingQueue = new LinkedList<>();
        Set<Booking> bookingSet = new BookingServiceIplm().sendBooking();
        for (Booking booking : bookingSet) {
            bookingQueue.add(booking);
        }
        while (!bookingQueue.isEmpty()) {

            Booking booking = bookingQueue.poll();
            Customer customer = booking.getCustomer();
            System.out.println("Đang tạo hợp đồng cho Booking có thông tin: " + booking.toString());
            System.out.println("Đang tạo hợp đồng cho Khách hàng có thông tin: " + customer.toString());
            System.out.println("Nhập id hợp đồng: ");
            String id = scanner.nextLine();
            System.out.println("Nhập số tiền trả trước: ");
            String pre = scanner.nextLine();
            System.out.println("Nhập số tiền trả sau: ");
            String pay = scanner.nextLine();

            Contract contract = new Contract(id, booking, pre, pay, customer);
            contractList.add(contract);
            System.out.println("Đã tạo hợp đồng thành công: " + contract.toString());

        }
    }

    @Override
    public void displayListContract() {
        for (Contract contract : contractList) {
            System.out.println(contract.toString());
        }

    }

    @Override
    public void editContract() {

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

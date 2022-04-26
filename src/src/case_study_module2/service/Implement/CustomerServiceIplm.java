package case_study_module2.service.Implement;

import case_study_module2.models.person.Customer;
import case_study_module2.service.CustomerService;
import case_study_module2.utils.RegexData;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceIplm implements CustomerService {
    static List<Customer> customerList = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);
    public static final String REGEX_BIRTHDAY = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";

    @Override
    public void display() {
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }

    }

    @Override
    public void addNew() {
        System.out.println("Nhập Id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập Tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        String age = RegexData.regexAge(scanner.nextLine(),REGEX_BIRTHDAY);
        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.println(" Nhập customerID: ");
        int customerId = Integer.parseInt(scanner.nextLine());
        System.out.println(" Nhập giới tính: ");
        String gender = scanner.nextLine();
        System.out.println(" Nhập số điện thoại: ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println(" Nhập Email: ");
        String email = scanner.nextLine();
        System.out.println("Nhập cấp độ khách hàng: ");
        String customerLevel = scanner.nextLine();
        Customer customer = new Customer(id, name, age, address, customerId, gender, phoneNumber, email, customerLevel);
        customerList.add(customer);


    }

    @Override
    public void edit() {


    }

    @Override
    public void delete() {

    }
}

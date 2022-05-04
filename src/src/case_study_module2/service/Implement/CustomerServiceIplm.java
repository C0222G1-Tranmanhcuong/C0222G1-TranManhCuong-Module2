package case_study_module2.service.Implement;

import case_study_module2.models.person.Customer;
import case_study_module2.models.person.Employee;
import case_study_module2.service.CustomerService;
import case_study_module2.utils.ReadAndWrite;
import case_study_module2.utils.RegexData;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceIplm implements CustomerService {
    static List<Customer> customerList = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);
    public static final String REGEX_STR = "[A-Z][a-z]+";
    public static final String REGEX_BIRTHDAY = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    public static final String FILE_CUSTOMER = "src\\case_study_module2\\data\\customer.csv";
    public static List<String[]> list1;
    @Override
    public void display() {
        list1 = ReadAndWrite.readList(FILE_CUSTOMER);
        for (String[] item : list1) {
            System.out.println(Arrays.toString(item));
        }

    }

    @Override
    public void addNew() throws IOException {
        list1 = ReadAndWrite.readList(FILE_CUSTOMER);

        for (String[] item : list1
        ) {
            customerList.add(new Customer(Integer.parseInt(item[0]), item[1], item[2],
                    item[3], Integer.parseInt(item[4]), item[5], Integer.parseInt(item[6]),
                    item[7], item[8]));
        }
        System.out.println("Nhập Id khách hàng muốn thêm mới: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean exist = false;
        for (int i = 0; i < customerList.size(); i++) {
            if ((customerList.get(i).getId() == id)) {
                exist = true;
                break;
            }
        }
        if (!exist) {
            String name = inputName();
            System.out.println("Nhập tuổi: ");
            String age = RegexData.regexAge(scanner.nextLine(), REGEX_BIRTHDAY);
            System.out.println("Nhập địa chỉ: ");
            String address = scanner.nextLine();
            System.out.println(" Nhập số CMND: ");
            int customerId = Integer.parseInt(scanner.nextLine());
            System.out.println(" Nhập giới tính: ");
            String gender = scanner.nextLine();
            System.out.println(" Nhập số điện thoại: ");
            int phoneNumber = Integer.parseInt(scanner.nextLine());
            System.out.println(" Nhập Email: ");
            String email = scanner.nextLine();
            System.out.println("Nhập cấp độ khách hàng: ");
            String customerLevel = "";
            boolean checkcustomerLevel2 = true;
            int choice3 = 0;

            while (checkcustomerLevel2) {
                System.out.println("---------MENU----------");
                System.out.println("1. Diamond ");
                System.out.println("2. Platinium ");
                System.out.println("3. Gold ");
                System.out.println("4. Silver ");
                System.out.println("5. Member ");
                System.out.println("-----------------------");
                System.out.println("Nhập lựa chọn: ");
                try {
                    choice3 = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Nhập sai định dạng, vui lòng nhập lại: ");
                }
                switch (choice3) {
                    case 1:
                        customerLevel += "Diamond";
                        checkcustomerLevel2 = false;
                        break;
                    case 2:
                        customerLevel += "Platinium ";
                        checkcustomerLevel2 = false;
                        break;
                    case 3:
                        customerLevel += "Gold ";
                        checkcustomerLevel2 = false;
                        break;
                    case 4:
                        customerLevel += "Silver";
                        checkcustomerLevel2 = false;
                        break;
                    case 5:
                        customerLevel += "Member";
                        checkcustomerLevel2 = false;
                        break;

                    default:
                        System.out.println(" Chỉ nhập từ 1-5");
                        break;
                }

            }
            Customer customer = new Customer(id, name, age,
                    address, customerId, gender,
                    phoneNumber, email, customerLevel);
            customerList.add(customer);
            String str = id + "," + name + ","
                    + age + "," + address +
                    "," + customerId + "," +
                    gender + "," + phoneNumber + "," + email + "," +
                    customerLevel;
            for (Customer item : customerList) {
                str = item.getId() + "," + item.getName()
                        + "," + item.getAge() + "," + item.getAddress() +
                        "," + item.getCustomerId() + "," + item.getGender() + "," +
                        item.getPhoneNumber() + "," + item.getEmail() + "," + item.getCustomerLevel();
            }
            ReadAndWrite.writeList(FILE_CUSTOMER, str);
        } else {
            System.out.println("Đã có khách hàng id này!");
        }
    }

    @Override
    public void edit() throws IOException {

        list1 = ReadAndWrite.readList(FILE_CUSTOMER);

        customerList.clear();

        for (String[] item : list1) {
            customerList.add(new Customer(Integer.parseInt(item[0]), item[1], item[2],
                    item[3], Integer.parseInt(item[4]), item[5], Integer.parseInt(item[6]),
                    item[7], item[8]));
        }

        display();

        System.out.println("Nhập Id khách hàng muốn sửa: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == id) {
                String name = inputName();
                System.out.println("Nhập tuổi: ");
                String age = RegexData.regexAge(scanner.nextLine(), REGEX_BIRTHDAY);
                System.out.println("Nhập địa chỉ: ");
                String address = scanner.nextLine();
                System.out.println(" Nhập số CMND: ");
                int customerId = Integer.parseInt(scanner.nextLine());
                System.out.println(" Nhập giới tính: ");
                String gender = scanner.nextLine();
                System.out.println(" Nhập số điện thoại: ");
                int phoneNumber = Integer.parseInt(scanner.nextLine());
                System.out.println(" Nhập Email: ");
                String email = scanner.nextLine();
                System.out.println("Nhập cấp độ khách hàng: ");
                String customerLevel = "";
                boolean checkcustomerLevel2 = true;
                int choice3 = 0;

                while (checkcustomerLevel2) {
                    System.out.println("---------MENU----------");
                    System.out.println("1. Diamond ");
                    System.out.println("2. Platinium ");
                    System.out.println("3. Gold ");
                    System.out.println("4. Silver ");
                    System.out.println("5. Member ");
                    System.out.println("-----------------------");
                    System.out.println("Nhập lựa chọn: ");
                    try {
                        choice3 = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Nhập sai định dạng, vui lòng nhập lại: ");
                    }
                    switch (choice3) {
                        case 1:
                            customerLevel += "Diamond";
                            checkcustomerLevel2 = false;
                            break;
                        case 2:
                            customerLevel += "Platinium ";
                            checkcustomerLevel2 = false;
                            break;
                        case 3:
                            customerLevel += "Gold ";
                            checkcustomerLevel2 = false;
                            break;
                        case 4:
                            customerLevel += "Silver";
                            checkcustomerLevel2 = false;
                            break;
                        case 5:
                            customerLevel += "Member";
                            checkcustomerLevel2 = false;
                            break;

                        default:
                            System.out.println(" Chỉ nhập từ 1-5");
                            break;
                    }

                }
                customerList.set(i, new Customer(id, name, age,
                        address, customerId, gender, phoneNumber, email, customerLevel));
                File file = new File(FILE_CUSTOMER);
                file.delete();
                String str;
                for (Customer item : customerList) {
                    str = item.getId() + "," + item.getName() + ","
                            + item.getAge() + "," + item.getAddress() + ","
                            + item.getCustomerId() + "," + item.getGender() + ","
                            + item.getPhoneNumber() + "," + item.getEmail() + ","
                            + item.getCustomerLevel() ;
                    ReadAndWrite.writeList(FILE_CUSTOMER, str);
                }

                check = true;

            }
        }
        if (!check) {
            System.out.println("Không có khách hàng sử dụng id này");
        }
            }


    @Override
    public void delete() {

    }
    private String inputName() {
        System.out.println("Nhập tên khách hàng: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_STR, "Bạn đã nhập sai định dạng, " +
                "tên nhân viên phải viết hoa kí tự đầu, các kí tự sau là bình thường");

    }
}

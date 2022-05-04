package case_study_module2.service.Implement;

import case_study_module2.models.person.Employee;
import case_study_module2.service.EmployeeService;
import case_study_module2.utils.ReadAndWrite;
import case_study_module2.utils.RegexData;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceIplm implements EmployeeService {
    static List<Employee> employeeList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public static final String REGEX_STR = "[A-Z][a-z]+";
    public static final String REGEX_BIRTHDAY = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    public static final String FILE_EMPLOYYE = "src\\case_study_module2\\data\\employee.csv";
    public static List<String[]> list;


    @Override
    public void display() {
        list = ReadAndWrite.readList(FILE_EMPLOYYE);
        for (String[] item : list) {
            System.out.println(Arrays.toString(item));
        }


    }

    @Override
    public void addNew() throws IOException {
        list = ReadAndWrite.readList(FILE_EMPLOYYE);

        for (String[] item : list
        ) {
            employeeList.add(new Employee(Integer.parseInt(item[0]), item[1], item[2],
                    item[3], Integer.parseInt(item[4]), item[5], Integer.parseInt(item[6]),
                    item[7], item[8], item[9], Double.parseDouble(item[10])));
        }
        System.out.println("Nhập Id nhân viên muốn thêm mới: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean exist = false;
        for (int i = 0; i < employeeList.size(); i++) {
            if ((employeeList.get(i).getId() == id)) {
                exist = true;
                break;
            }
        }

        if (!exist) {
            String name = inputName();
            System.out.println("Nhập tuổi: ");
            String dateofbirth = RegexData.regexAge(scanner.nextLine(), REGEX_BIRTHDAY);
            System.out.println("Nhập địa chỉ: ");
            String address = scanner.nextLine();
            System.out.println(" Nhập số CMND: ");
            int employeeId = Integer.parseInt(scanner.nextLine());
            System.out.println(" Nhập giới tính: ");
            String gender = scanner.nextLine();
            System.out.println(" Nhập số điện thoại: ");
            long phoneNumber = Long.parseLong(scanner.nextLine());
            System.out.println(" Nhập Email: ");
            String email = scanner.nextLine();
            System.out.println(" Nhập trình độ: ");
            String level = "";
            boolean check1 = true;
            int choice = 0;
            while (check1) {
                System.out.println("---------MENU----------");
                System.out.println("1. Trung cấp ");
                System.out.println("2. Cao đẳng ");
                System.out.println("3. Đại học ");
                System.out.println("4. Sau đại học ");
                System.out.println("-----------------------");
                System.out.println("Nhập lựa chọn: ");
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Nhập sai định dạng, vui lòng nhập lại: ");
                }
                switch (choice) {
                    case 1:
                        level += "Trung cấp";
                        check1 = false;
                        break;
                    case 2:
                        level += "Cao đẳng ";
                        check1 = false;
                        break;
                    case 3:
                        level += "Đại học ";
                        check1 = false;
                        break;
                    case 4:
                        level += "Sau đại học";
                        check1 = false;
                        break;
                    default:
                        System.out.println(" Chỉ nhập từ 1-4");
                        break;
                }
            }

            System.out.println(" Nhập vị trí: ");
            String position = "";
            boolean checkPosition = true;
            int choice1 = 0;

            while (checkPosition) {
                System.out.println("---------MENU----------");
                System.out.println("1. Lễ tân ");
                System.out.println("2. Phục vụ ");
                System.out.println("3. Chuyên viên");
                System.out.println("4. Giám sát ");
                System.out.println("5. Quản lý ");
                System.out.println("6 Giám đốc ");
                System.out.println("-----------------------");
                System.out.println("Nhập lựa chọn: ");
                try {
                    choice1 = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Nhập sai định dạng, vui lòng nhập lại: ");
                }
                switch (choice1) {
                    case 1:
                        position += "Lễ tân";
                        checkPosition = false;
                        break;
                    case 2:
                        position += "Phục vụ ";
                        checkPosition = false;
                        break;
                    case 3:
                        position += "Chuyên viên ";
                        checkPosition = false;
                        break;
                    case 4:
                        position += "Giám sát";
                        checkPosition = false;
                        break;
                    case 5:
                        position += "Quản lý";
                        checkPosition = false;
                        break;
                    case 6:
                        position += "Giám đốc";
                        checkPosition = false;
                        break;
                    default:
                        System.out.println(" Chỉ nhập từ 1-6");
                        break;
                }
            }


            System.out.println(" Nhập lương: ");
            double salary = Double.parseDouble(scanner.nextLine());
            Employee employee = new Employee(id, name, dateofbirth,
                    address, employeeId, gender,
                    phoneNumber, email, level, position, salary);
            employeeList.add(employee);
            String str = id + "," + name + ","
                    + dateofbirth + "," + address +
                    "," + employeeId + "," +
                    gender + "," + phoneNumber + "," + email + "," +
                    level + "," + position + "," + salary;
            for (Employee item : employeeList) {
                str = item.getId() + "," + item.getName()
                        + "," + item.getAge() + "," + item.getAddress() +
                        "," + item.getEmployeeId() + "," + item.getGender() + "," +
                        item.getPhoneNumber() + "," + item.getEmail() + "," + item.getLevel() +
                        "," + item.getPosition() + "," + item.getSalary();
            }
            ReadAndWrite.writeList(FILE_EMPLOYYE, str);
        } else {
            System.out.println("Đã có nhân viên sử dụng id này!");
        }


    }

    @Override
    public void edit() throws IOException {
        list = ReadAndWrite.readList(FILE_EMPLOYYE);

        employeeList.clear();

        for (String[] item : list) {
            employeeList.add(new Employee(Integer.parseInt(item[0]), item[1], item[2],
                    item[3], Integer.parseInt(item[4]), item[5], Integer.parseInt(item[6]),
                    item[7], item[8], item[9], Double.parseDouble(item[10])));
        }

        display();

        System.out.println("Nhập Id nhân viên muốn sửa: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id) {
                String name = inputName();
                System.out.println("Nhập tuổi: ");
                String dateofbirth = RegexData.regexAge(scanner.nextLine(), REGEX_BIRTHDAY);
                System.out.println("Nhập địa chỉ: ");
                String address = scanner.nextLine();
                System.out.println(" Nhập số CMND: ");
                int employeeId = Integer.parseInt(scanner.nextLine());
                System.out.println(" Nhập giới tính: ");
                String gender = scanner.nextLine();
                System.out.println(" Nhập số điện thoại: ");
                long phoneNumber = Long.parseLong(scanner.nextLine());
                System.out.println(" Nhập Email: ");
                String email = scanner.nextLine();
                System.out.println(" Nhập trình độ: ");
                String level = "";
                boolean check2 = true;
                int choice2 = 0;
                while (check2) {
                    System.out.println("---------MENU----------");
                    System.out.println("1. Trung cấp ");
                    System.out.println("2. Cao đẳng ");
                    System.out.println("3. Đại học ");
                    System.out.println("4. Sau đại học ");
                    System.out.println("-----------------------");
                    System.out.println("Nhập lựa chọn: ");
                    try {
                        choice2 = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Nhập sai định dạng, vui lòng nhập lại: ");
                    }
                    switch (choice2) {
                        case 1:
                            level += "Trung cấp";
                            check2 = false;
                            break;
                        case 2:
                            level += "Cao đẳng ";
                            check2 = false;
                            break;
                        case 3:
                            level += "Đại học ";
                            check2 = false;
                            break;
                        case 4:
                            level += "Sau đại học";
                            check2 = false;
                            break;
                        default:
                            System.out.println(" Chỉ nhập từ 1-4");
                            break;
                    }
                }

                System.out.println(" Nhập vị trí: ");
                String position = "";
                boolean checkPosition2 = true;
                int choice3 = 0;

                while (checkPosition2) {
                    System.out.println("---------MENU----------");
                    System.out.println("1. Lễ tân ");
                    System.out.println("2. Phục vụ ");
                    System.out.println("3. Chuyên viên");
                    System.out.println("4. Giám sát ");
                    System.out.println("5. Quản lý ");
                    System.out.println("6 Giám đốc ");
                    System.out.println("-----------------------");
                    System.out.println("Nhập lựa chọn: ");
                    try {
                        choice3 = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Nhập sai định dạng, vui lòng nhập lại: ");
                    }
                    switch (choice3) {
                        case 1:
                            position += "Lễ tân";
                            checkPosition2 = false;
                            break;
                        case 2:
                            position += "Phục vụ ";
                            checkPosition2 = false;
                            break;
                        case 3:
                            position += "Chuyên viên ";
                            checkPosition2 = false;
                            break;
                        case 4:
                            position += "Giám sát";
                            checkPosition2 = false;
                            break;
                        case 5:
                            position += "Quản lý";
                            checkPosition2 = false;
                            break;
                        case 6:
                            position += "Giám đốc";
                            checkPosition2 = false;
                            break;
                        default:
                            System.out.println(" Chỉ nhập từ 1-6");
                            break;
                    }

                }
                System.out.println(" Nhập lương: ");
                double salary = Double.parseDouble(scanner.nextLine());
                employeeList.set(i, new Employee(id, name, dateofbirth,
                        address, employeeId, gender, phoneNumber, email, level, position, salary));
                File file = new File(FILE_EMPLOYYE);
                file.delete();
                String str;
                for (Employee item : employeeList) {
                    str = item.getId() + "," + item.getName() + ","
                            + item.getAge() + "," + item.getAddress() + ","
                            + item.getEmployeeId() + "," + item.getGender() + ","
                            + item.getPhoneNumber() + "," + item.getEmail() + ","
                            + item.getLevel() + "," + item.getPosition() + "," + item.getSalary();
                    ReadAndWrite.writeList(FILE_EMPLOYYE, str);
                }

                check = true;

            }
        }
        if (!check) {
            System.out.println("Không có nhân viên sử dụng id này");
        }

    }

    @Override
    public void delete() {

    }

    private String inputName() {
        System.out.println("Nhập tên nhân viên: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_STR, "Bạn đã nhập sai định dạng, " +
                "tên nhân viên phải viết hoa kí tự đầu, các kí tự sau là bình thường");

    }
}


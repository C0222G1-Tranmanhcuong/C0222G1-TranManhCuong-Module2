package case_study_module2.service.Implement;

import case_study_module2.models.person.Employee;
import case_study_module2.service.EmployeeService;
import case_study_module2.utils.RegexData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceIplm implements EmployeeService {
    static List<Employee> employeeList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public static final String REGEX_BIRTHDAY = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    static {
        employeeList.add(new Employee(1,"Cuong","28/01/1997","QB",112,"Nam",409594,"áhdkasd","cao dang","quan ly",90000));
        employeeList.add(new Employee(2,"Hung","22/10/1995","DN",211,"Nam",409594,"áhdkasd","cao dang","quan ly",90000));
    }

    @Override
    public void display() {
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }


    }

    @Override
    public void addNew() {
        System.out.println("Nhập Id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập Tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        String dateofbirth = RegexData.regexAge(scanner.nextLine(),REGEX_BIRTHDAY);
        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.println(" Nhập employeeID: ");
        int employeeId = Integer.parseInt(scanner.nextLine());
        System.out.println(" Nhập giới tính: ");
        String gender = scanner.nextLine();
        System.out.println(" Nhập số điện thoại: ");
        long phoneNumber = Long.parseLong(scanner.nextLine());
        System.out.println(" Nhập Email: ");
        String email = scanner.nextLine();
        System.out.println(" Nhập chức vụ: ");
        String level = scanner.nextLine();
        System.out.println(" Nhập vị trí: ");
        String position = scanner.nextLine();
        System.out.println(" Nhập lương: ");
        double salary = Double.parseDouble(scanner.nextLine());
        Employee employee = new Employee(id, name, dateofbirth, address, employeeId, gender, phoneNumber, email, level, position, salary);
        employeeList.add(employee);


    }

    @Override
    public void edit() {
        System.out.println("Nhập ID của nhân viên mà bạn muốn sửa đổi thông tin: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = true;
        for (Employee item:employeeList) {
            if (item.getEmployeeId()== id){
                System.out.println("Nhập Id mới: ");
                int newId = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập tên: ");
                String name = scanner.nextLine();
                System.out.println("Nhập tuổi: ");
                String age = RegexData.regexAge(scanner.nextLine(),REGEX_BIRTHDAY);
                System.out.println("Nhập địa chỉ: ");
                String address = scanner.nextLine();
                System.out.println(" Nhập employeeID: ");
                int employeeId = Integer.parseInt(scanner.nextLine());
                System.out.println(" Nhập giới tính: ");
                String gender = scanner.nextLine();
                System.out.println(" Nhập số điện thoại: ");
                long phoneNumber = Long.parseLong(scanner.nextLine());
                System.out.println(" Nhập Email: ");
                String email = scanner.nextLine();
                System.out.println(" Nhập chức vụ: ");
                String level = scanner.nextLine();
                System.out.println(" Nhập vị trí: ");
                String position = scanner.nextLine();
                System.out.println(" Nhập lương: ");
                double salary = Double.parseDouble(scanner.nextLine());
                Employee employee = new Employee(newId,name,age,address,employeeId,gender,phoneNumber,email,level,position,salary);
                employeeList.add(employee);
                display();
                check = true;
                break;
            }

        }
        if (!check) {
            System.out.println("Nhập sai ID!");
        }

    }

    @Override
    public void delete() {

    }
}

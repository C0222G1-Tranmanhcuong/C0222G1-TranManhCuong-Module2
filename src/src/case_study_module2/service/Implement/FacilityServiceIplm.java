package case_study_module2.service.Implement;

import _14_io_text_file.exercise.read_file_csv.ReadAndWrite;
import case_study_module2.models.facility.Facility;
import case_study_module2.models.facility.House;
import case_study_module2.models.facility.Room;
import case_study_module2.models.facility.Villa;
import case_study_module2.service.FacilityService;
import case_study_module2.utils.RegexData;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceIplm implements FacilityService {
    public static final String REGEX_STR = "[A-Z][a-z]+";
    public static final String REGEX_ID_VILLA = "(SVVL)[-][\\d]{4}";
    public static final String REGEX_ID_HOUSE = "(SVHO)[-][\\d]{4}";
    public static final String REGEX_ID_ROOM = "(SVRO)[-][\\d]{4}";
    public static final String REGEX_AMOUNT = "^[1-9]|([1][0-9])|(20)$";
    public static final String REGEX_INT = "^[1-9]|([1][0-9])$";
    public static final String REGEX_AREA = "^([3-9]\\d|[1-9]\\d{2,})$";
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();

    static {
        facilityIntegerMap.put(new Villa("1", "Villa 1", 13, 100,
                10, "Day", "VIP", 15, 3), 0);
        facilityIntegerMap.put(new Villa("2", "Villa 2", 14, 99,
                14, "Day", "VIP", 15, 3), 0);
    }

    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            System.out.println("Service" + element.getKey() + "Số lần đã thuê" + element.getValue());
        }


    }

    @Override
    public void displayMaintain() {

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

    @Override
    public void addNewVilla() {

        String id = inputIdVilla();

        String name = inputName();

        double area = Double.parseDouble(inputArea());

        int price = Integer.parseInt(inputPrice());
        int people = Integer.parseInt(inputPeople());

        String rentType = inputRentType();
        String standard = inputStandard();

        double areaPool = Double.parseDouble(inputAreaPool());
        int floor = Integer.parseInt(inputFloor());

        Villa villa = new Villa(id, name, area, price, people, rentType, standard, areaPool, floor);
        facilityIntegerMap.put(villa, 0);
        System.out.println("Thêm villa thành công!");
    }

    private String inputIdVilla() {
        System.out.println("Nhập id, mã dịch vụ: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_ID_VILLA, "Bạn đã nhập sai định dạng," +
                " mã dịch vụ phải có dạng là SVVL-YYYY");

    }

    private String inputIdHouse() {
        System.out.println("Nhập id, mã dịch vụ: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_ID_HOUSE, "Bạn đã nhập sai định dạng," +
                " mã dịch vụ phải có dạng là SVHO-YYYY");

    }

    private String inputIdRoom() {
        System.out.println("Nhập id, mã dịch vụ: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_ID_ROOM, "Bạn đã nhập sai định dạng," +
                " mã dịch vụ phải có dạng là SVRO-YYYY");

    }

    private String inputName() {
        System.out.println("Nhập tên dịch vụ: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_STR, "Bạn đã nhập sai định dạng, " +
                "tên dịch vụ phải viết hoa kí tự đầu, các kí tự sau là bình thường");

    }

    private String inputArea() {
        System.out.println("Nhập diện tích: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_AREA, "Bạn đã nhập sai định dạng, diện tích phải lớn hơn 30m2");
    }

    private String inputAreaPool() {
        System.out.println("Nhập diện tích hồ bơi: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_AREA, "Bạn đã nhập sai định dạng, diện tích phải lớn hơn 30m2");
    }

    private String inputPrice() {
        System.out.println("Nhập giá dịch vụ: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_INT, "Bạn đã nhập sai định dạng, giá tiền phải là số dương");

    }

    private String inputPeople() {
        System.out.println("Nhập số lượng người: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_AMOUNT, "Bạn đã nhập sai định dạng, " +
                "số lượng người phải lớn hơn 0 và nhỏ hơn 20");

    }

    private String inputFloor() {
        System.out.println("Nhập số tầng: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_INT, "Bạn đã nhập sai định dạng, số tầng phải là số dương");

    }

    private String inputRentType() {
        System.out.println("Nhập kiểu thuê: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_STR, "Bạn đã nhập sai định dạng, " +
                "kiểu thuê phải viết hoa kí tự đầu, các kí tự sau là bình thường ");

    }

    private String inputStandard() {
        System.out.println("Nhập tiêu chuẩn phòng: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_STR, "Bạn đã nhập sai định dạng, " +
                "tiêu chuẩn phòng phải viết hoa kí tự đầu, các kí tự sau là bình thường ");

    }


    @Override
    public void addNewHouse() {
        String id = inputIdHouse();

        String name = inputName();

        double area = Double.parseDouble(inputArea());

        int price = Integer.parseInt(inputPrice());
        int people = Integer.parseInt(inputPeople());

        String rentType = inputRentType();

        int floor = Integer.parseInt(inputFloor());

        House house = new House(id, name, area, price, people, rentType, floor);
        facilityIntegerMap.put(house, 0);
        System.out.println("Thêm house thành công!");

    }


    @Override
    public void addNewRoom() {
        String id = inputIdRoom();

        String name = inputName();

        double area = Double.parseDouble(inputArea());

        int price = Integer.parseInt(inputPrice());
        int people = Integer.parseInt(inputPeople());

        String rentType = inputRentType();

        String freeService = scanner.nextLine();

        Room room = new Room(id, name, area, price, people, rentType, freeService);
        facilityIntegerMap.put(room, 0);
        System.out.println("Thêm room thành công!");


    }
}

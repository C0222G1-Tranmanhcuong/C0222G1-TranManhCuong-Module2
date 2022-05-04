package case_study_module2.service.Implement;

import _14_io_text_file.exercise.read_file_csv.ReadAndWrite;
import case_study_module2.models.facility.Facility;
import case_study_module2.models.facility.House;
import case_study_module2.models.facility.Room;
import case_study_module2.models.facility.Villa;
import case_study_module2.service.FacilityService;
import case_study_module2.utils.RegexData;

import java.io.IOException;
import java.util.*;

public class FacilityServiceIplm implements FacilityService {
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static final String REGEX_STR = "[A-Z][a-z]+";
    public static final String REGEX_ID_VILLA = "(SVVL)[-][\\d]{4}";
    public static final String REGEX_ID_HOUSE = "(SVHO)[-][\\d]{4}";
    public static final String REGEX_ID_ROOM = "(SVRO)[-][\\d]{4}";

    public static final String FILE_VILLA = "src\\case_study_module2\\data\\villa.csv";
    public static final String FILE_HOUSE = "src\\case_study_module2\\data\\house.csv";
    public static final String FILE_ROOM = "src\\case_study_module2\\data\\room.csv";
    public static final String FILE_FACILITY = "src\\case_study_module2\\data\\facility.csv";

    public static List<String[]> facilityList = new ArrayList<>();
//    public static List<String[]> villaList = new ArrayList<>();
//    public static List<String[]> houseList = new ArrayList<>();

//    String idFacility,
//    String nameService,
//    double areaUse,
//    int rentalPrice,
//    int peopleMax,
//    String styleRental,
//    int floor


    @Override
    public void display() throws IOException {
        facilityList = ReadAndWrite.readFile(FILE_FACILITY);
        facilityIntegerMap.clear();
        for (String[] item : facilityList) {
            if (item[1].equals("Villa")) {
                facilityIntegerMap.put(new Villa(item[0], item[1], Double.parseDouble(item[2]), Integer.parseInt(item[3]),
                        Integer.parseInt(item[4]),
                        item[5], item[6], Double.parseDouble(item[7]), Integer.parseInt(item[8])), Integer.parseInt(item[9]));
            } else if (item[1].equals("House")) {
                facilityIntegerMap.put(new House(item[0], item[1], Double.parseDouble(item[2]), Integer.parseInt(item[3]),
                        Integer.parseInt(item[4]), item[5], Integer.parseInt(item[6])), Integer.parseInt(item[7]));
            } else {
                facilityIntegerMap.put(new Room(item[0], item[1], Double.parseDouble(item[2]), Integer.parseInt(item[3]), Integer.parseInt(item[4]), item[5], item[6]), Integer.parseInt(item[7]));
            }

        }
//        villaList = ReadAndWrite.readFile(FILE_VILLA);
//        facilityIntegerMap.clear();
//        for (String[] item :villaList) {
//            facilityIntegerMap.put(new Villa(item[0], item[1], Double.parseDouble(item[2]), Integer.parseInt(item[3]),
//                        Integer.parseInt(item[4]),
//                        item[5], item[6], Double.parseDouble(item[7]), Integer.parseInt(item[8])), Integer.parseInt(item[9]));
//
//        }



        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            System.out.println("Service: " + element.getKey() + "Số lần đã thuê" + element.getValue());
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
    public void addNewVilla() throws IOException {
        facilityList = ReadAndWrite.readFile(FILE_FACILITY);



        String id = inputIdVilla();
        boolean check = true;
        for (Map.Entry<Facility, Integer> item : facilityIntegerMap.entrySet()) {
            if (item.getKey().getIdFacility().equals(id)) {
                check = false;
            }

        }
        if (!check) {
            System.out.println("Id này đã tồn tại!");
        } else {
            String name = "Villa";

            double areaVilla;
            while (true) {
                try {
                    System.out.println("Nhập diện tích Villa: ");
                    areaVilla = Double.parseDouble(scanner.nextLine());
                    if (areaVilla > 30) {
                        break;
                    } else {
                        System.out.println("Diện tích Villa phải lớn hơn 30m2 !");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Nhập sai định dạng!");
                }
            }

            int rentalPrice;
            while (true) {
                try {
                    System.out.println("Nhập chi phí thuê: ");
                    rentalPrice = Integer.parseInt(scanner.nextLine());
                    if (rentalPrice > 0) {
                        break;
                    } else {
                        System.out.println("Chi phí phải là số dương!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Nhập sai định dạng!");
                }
            }

            int people;
            while (true) {
                try {
                    System.out.println("Nhập số lượng người: ");
                    people = Integer.parseInt(scanner.nextLine());
                    if (people > 0 && people < 20) {
                        break;
                    } else {
                        System.out.println("Số lượng người phải lớn hơn 0 và bé hơn 20!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Nhập sai định dạng!");
                }
            }

            String rentType = inputRentType();
            String standard = inputStandard();

            double areaPool;
            while (true) {
                try {
                    System.out.println("Nhập diện tích hồ bơi: ");
                    areaPool = Double.parseDouble(scanner.nextLine());
                    if (areaPool > 30) {
                        break;
                    } else {
                        System.out.println("Diện tích hồ bơi phải lớn hơn 30m2 !");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Nhập sai định dạng!");
                }
            }

            int floor = 0;
            while (true) {
                try {
                    System.out.println("Nhập số tầng: ");
                    floor = Integer.parseInt(scanner.nextLine());
                    if (floor > 0) {
                        break;
                    } else {
                        System.out.println("Số tầng phải là số nguyên dương!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Nhập sai định dạng!");
                }


            }
            String line = id + "," + name + "," + areaVilla + "," + rentalPrice + "," + people + "," + rentType + "," + standard + "," + areaPool + "," + floor;
            ReadAndWrite.writeFile(FILE_FACILITY, line + ",0");
            System.out.println("Thêm villa thành công!");

        }


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
    public void addNewHouse() throws IOException {
        facilityList = ReadAndWrite.readFile(FILE_FACILITY);
        String id = inputIdHouse();
        boolean check = true;
        for (Map.Entry<Facility, Integer> item : facilityIntegerMap.entrySet()) {
            if (item.getKey().getIdFacility().equals(id)) {
                check = false;
            }
        }
        if (!check) {
            System.out.println("Id này đã tồn tại!");
        } else {
            String name = "House";

            double areaHouse;
            while (true) {
                try {
                    System.out.println("Nhập diện tích House: ");
                    areaHouse = Double.parseDouble(scanner.nextLine());
                    if (areaHouse > 30) {
                        break;
                    } else {
                        System.out.println("Diện tích House phải lớn hơn 30m2 !");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Nhập sai định dạng!");
                }
            }

            int rentalPrice;
            while (true) {
                try {
                    System.out.println("Nhập chi phí thuê: ");
                    rentalPrice = Integer.parseInt(scanner.nextLine());
                    if (rentalPrice > 0) {
                        break;
                    } else {
                        System.out.println("Chi phí phải là số dương!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Nhập sai định dạng!");
                }
            }

            int people;
            while (true) {
                try {
                    System.out.println("Nhập số lượng người: ");
                    people = Integer.parseInt(scanner.nextLine());
                    if (people > 0 && people < 20) {
                        break;
                    } else {
                        System.out.println("Số lượng người phải lớn hơn 0 và bé hơn 20!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Nhập sai định dạng!");
                }
            }

            String rentType = inputRentType();

            int floor = 0;
            while (true) {
                try {
                    System.out.println("Nhập số tầng: ");
                    floor = Integer.parseInt(scanner.nextLine());
                    if (floor > 0) {
                        break;
                    } else {
                        System.out.println("Số tầng phải là số nguyên dương!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Nhập sai định dạng!");
                }
            }
            String line = id + "," + name + "," + areaHouse + "," + rentalPrice + "," + people + "," + rentType + "," + floor;
            ReadAndWrite.writeFile(FILE_FACILITY, line + ",0");
            System.out.println("Thêm house thành công!");
        }
    }


    @Override
    public void addNewRoom() throws IOException {
        facilityList = ReadAndWrite.readFile(FILE_ROOM);
        String id = inputIdRoom();
        boolean check = true;
        for (Map.Entry<Facility, Integer> item : facilityIntegerMap.entrySet()) {
            if (item.getKey().getIdFacility().equals(id)) {
                check = false;
            }
        }
        if (!check) {
            System.out.println("Id này đã tồn tại!");
        } else {

            String name = "Room";

            double areaRoom;
            while (true) {
                try {
                    System.out.println("Nhập diện tích Villa: ");
                    areaRoom = Double.parseDouble(scanner.nextLine());
                    if (areaRoom > 30) {
                        break;
                    } else {
                        System.out.println("Diện tích Villa phải lớn hơn 30m2 !");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Nhập sai định dạng!");
                }
            }

            int rentalPrice;
            while (true) {
                try {
                    System.out.println("Nhập chi phí thuê: ");
                    rentalPrice = Integer.parseInt(scanner.nextLine());
                    if (rentalPrice > 0) {
                        break;
                    } else {
                        System.out.println("Chi phí phải là số dương!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Nhập sai định dạng!");
                }
            }

            int people;
            while (true) {
                try {
                    System.out.println("Nhập số lượng người: ");
                    people = Integer.parseInt(scanner.nextLine());
                    if (people > 0 && people < 20) {
                        break;
                    } else {
                        System.out.println("Số lượng người phải lớn hơn 0 và bé hơn 20!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Nhập sai định dạng!");
                }
            }

            String rentType = inputRentType();
            System.out.println("chọn dich vụ free");
            String freeService = scanner.nextLine();

            String line = id + "," + name + "," + areaRoom + "," + rentalPrice + "," + people + "," + rentType + "," + freeService;
            ReadAndWrite.writeFile(FILE_FACILITY, line + ",0");
            System.out.println("Thêm room thành công!");


        }
    }
}

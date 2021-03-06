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
            System.out.println("Service: " + element.getKey() + "S??? l???n ???? thu??" + element.getValue());
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
            System.out.println("Id n??y ???? t???n t???i!");
        } else {
            String name = "Villa";

            double areaVilla;
            while (true) {
                try {
                    System.out.println("Nh???p di???n t??ch Villa: ");
                    areaVilla = Double.parseDouble(scanner.nextLine());
                    if (areaVilla > 30) {
                        break;
                    } else {
                        System.out.println("Di???n t??ch Villa ph???i l???n h??n 30m2 !");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Nh???p sai ?????nh d???ng!");
                }
            }

            int rentalPrice;
            while (true) {
                try {
                    System.out.println("Nh???p chi ph?? thu??: ");
                    rentalPrice = Integer.parseInt(scanner.nextLine());
                    if (rentalPrice > 0) {
                        break;
                    } else {
                        System.out.println("Chi ph?? ph???i l?? s??? d????ng!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Nh???p sai ?????nh d???ng!");
                }
            }

            int people;
            while (true) {
                try {
                    System.out.println("Nh???p s??? l?????ng ng?????i: ");
                    people = Integer.parseInt(scanner.nextLine());
                    if (people > 0 && people < 20) {
                        break;
                    } else {
                        System.out.println("S??? l?????ng ng?????i ph???i l???n h??n 0 v?? b?? h??n 20!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Nh???p sai ?????nh d???ng!");
                }
            }

            String rentType = inputRentType();
            String standard = inputStandard();

            double areaPool;
            while (true) {
                try {
                    System.out.println("Nh???p di???n t??ch h??? b??i: ");
                    areaPool = Double.parseDouble(scanner.nextLine());
                    if (areaPool > 30) {
                        break;
                    } else {
                        System.out.println("Di???n t??ch h??? b??i ph???i l???n h??n 30m2 !");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Nh???p sai ?????nh d???ng!");
                }
            }

            int floor = 0;
            while (true) {
                try {
                    System.out.println("Nh???p s??? t???ng: ");
                    floor = Integer.parseInt(scanner.nextLine());
                    if (floor > 0) {
                        break;
                    } else {
                        System.out.println("S??? t???ng ph???i l?? s??? nguy??n d????ng!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Nh???p sai ?????nh d???ng!");
                }


            }
            String line = id + "," + name + "," + areaVilla + "," + rentalPrice + "," + people + "," + rentType + "," + standard + "," + areaPool + "," + floor;
            ReadAndWrite.writeFile(FILE_FACILITY, line + ",0");
            System.out.println("Th??m villa th??nh c??ng!");

        }


    }

    private String inputIdVilla() {
        System.out.println("Nh???p id, m?? d???ch v???: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_ID_VILLA, "B???n ???? nh???p sai ?????nh d???ng," +
                " m?? d???ch v??? ph???i c?? d???ng l?? SVVL-YYYY");

    }

    private String inputIdHouse() {
        System.out.println("Nh???p id, m?? d???ch v???: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_ID_HOUSE, "B???n ???? nh???p sai ?????nh d???ng," +
                " m?? d???ch v??? ph???i c?? d???ng l?? SVHO-YYYY");

    }

    private String inputIdRoom() {
        System.out.println("Nh???p id, m?? d???ch v???: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_ID_ROOM, "B???n ???? nh???p sai ?????nh d???ng," +
                " m?? d???ch v??? ph???i c?? d???ng l?? SVRO-YYYY");

    }

    private String inputName() {
        System.out.println("Nh???p t??n d???ch v???: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_STR, "B???n ???? nh???p sai ?????nh d???ng, " +
                "t??n d???ch v??? ph???i vi???t hoa k?? t??? ?????u, c??c k?? t??? sau l?? b??nh th?????ng");

    }


    private String inputRentType() {
        System.out.println("Nh???p ki???u thu??: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_STR, "B???n ???? nh???p sai ?????nh d???ng, " +
                "ki???u thu?? ph???i vi???t hoa k?? t??? ?????u, c??c k?? t??? sau l?? b??nh th?????ng ");

    }

    private String inputStandard() {
        System.out.println("Nh???p ti??u chu???n ph??ng: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_STR, "B???n ???? nh???p sai ?????nh d???ng, " +
                "ti??u chu???n ph??ng ph???i vi???t hoa k?? t??? ?????u, c??c k?? t??? sau l?? b??nh th?????ng ");

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
            System.out.println("Id n??y ???? t???n t???i!");
        } else {
            String name = "House";

            double areaHouse;
            while (true) {
                try {
                    System.out.println("Nh???p di???n t??ch House: ");
                    areaHouse = Double.parseDouble(scanner.nextLine());
                    if (areaHouse > 30) {
                        break;
                    } else {
                        System.out.println("Di???n t??ch House ph???i l???n h??n 30m2 !");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Nh???p sai ?????nh d???ng!");
                }
            }

            int rentalPrice;
            while (true) {
                try {
                    System.out.println("Nh???p chi ph?? thu??: ");
                    rentalPrice = Integer.parseInt(scanner.nextLine());
                    if (rentalPrice > 0) {
                        break;
                    } else {
                        System.out.println("Chi ph?? ph???i l?? s??? d????ng!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Nh???p sai ?????nh d???ng!");
                }
            }

            int people;
            while (true) {
                try {
                    System.out.println("Nh???p s??? l?????ng ng?????i: ");
                    people = Integer.parseInt(scanner.nextLine());
                    if (people > 0 && people < 20) {
                        break;
                    } else {
                        System.out.println("S??? l?????ng ng?????i ph???i l???n h??n 0 v?? b?? h??n 20!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Nh???p sai ?????nh d???ng!");
                }
            }

            String rentType = inputRentType();

            int floor = 0;
            while (true) {
                try {
                    System.out.println("Nh???p s??? t???ng: ");
                    floor = Integer.parseInt(scanner.nextLine());
                    if (floor > 0) {
                        break;
                    } else {
                        System.out.println("S??? t???ng ph???i l?? s??? nguy??n d????ng!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Nh???p sai ?????nh d???ng!");
                }
            }
            String line = id + "," + name + "," + areaHouse + "," + rentalPrice + "," + people + "," + rentType + "," + floor;
            ReadAndWrite.writeFile(FILE_FACILITY, line + ",0");
            System.out.println("Th??m house th??nh c??ng!");
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
            System.out.println("Id n??y ???? t???n t???i!");
        } else {

            String name = "Room";

            double areaRoom;
            while (true) {
                try {
                    System.out.println("Nh???p di???n t??ch Villa: ");
                    areaRoom = Double.parseDouble(scanner.nextLine());
                    if (areaRoom > 30) {
                        break;
                    } else {
                        System.out.println("Di???n t??ch Villa ph???i l???n h??n 30m2 !");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Nh???p sai ?????nh d???ng!");
                }
            }

            int rentalPrice;
            while (true) {
                try {
                    System.out.println("Nh???p chi ph?? thu??: ");
                    rentalPrice = Integer.parseInt(scanner.nextLine());
                    if (rentalPrice > 0) {
                        break;
                    } else {
                        System.out.println("Chi ph?? ph???i l?? s??? d????ng!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Nh???p sai ?????nh d???ng!");
                }
            }

            int people;
            while (true) {
                try {
                    System.out.println("Nh???p s??? l?????ng ng?????i: ");
                    people = Integer.parseInt(scanner.nextLine());
                    if (people > 0 && people < 20) {
                        break;
                    } else {
                        System.out.println("S??? l?????ng ng?????i ph???i l???n h??n 0 v?? b?? h??n 20!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Nh???p sai ?????nh d???ng!");
                }
            }

            String rentType = inputRentType();
            System.out.println("ch???n dich v??? free");
            String freeService = scanner.nextLine();

            String line = id + "," + name + "," + areaRoom + "," + rentalPrice + "," + people + "," + rentType + "," + freeService;
            ReadAndWrite.writeFile(FILE_FACILITY, line + ",0");
            System.out.println("Th??m room th??nh c??ng!");


        }
    }
}

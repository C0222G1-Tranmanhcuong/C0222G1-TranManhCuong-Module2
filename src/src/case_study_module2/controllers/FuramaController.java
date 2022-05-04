package case_study_module2.controllers;

import case_study_module2.service.Implement.*;

import java.io.IOException;
import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) throws IOException {
        displayMainMenu();
    }

    public static void displayMainMenu() throws IOException {
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("---------MENU----------");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.println("-----------------------");
            System.out.println("Nhập lựa chọn: ");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Nhập sai định dạng, vui lòng nhập lại: ");
            }

            switch (choice) {
                case 1:
                    displayEmployeeMenu();
                    break;

                case 2:
                    displayCustomerMenu();
                    break;

                case 3:
                    displayFacilityMenu();
                    break;

                case 4:
                    displayBookingMenu();
                    break;
                case 5:


                case 6:
                    check=false;
                default:
                    System.out.println("Mời nhập lại lựa chọn: ");
                    break;



            }

        }
    }

    public static void displayEmployeeMenu() throws IOException {
        EmployeeServiceIplm employeeServiceIplm = new EmployeeServiceIplm();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("-----------MENU-----------");
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return main menu");
            System.out.println("---------------------------");
            Scanner scanner = new Scanner(System.in);
            try{
                choice= Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại: ");
            }
            switch (choice) {
                case 1:
                    employeeServiceIplm.display();
                    break;
                case 2:
                    employeeServiceIplm.addNew();
                    break;
                case 3:
                    employeeServiceIplm.edit();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Mời nhập lại lựa chọn: ");
                    break;

            }


        }
    }

    public static void displayCustomerMenu() throws IOException {
        CustomerServiceIplm customerServiceIplm = new CustomerServiceIplm();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("-----------MENU----------");
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");
            System.out.println("------------------------");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại: ");
            }

            switch (choice) {
                case 1:
                    customerServiceIplm.display();
                    break;
                case 2:
                    customerServiceIplm.addNew();
                    break;
                case 3:
                    customerServiceIplm.edit();
                    break;

                case 4:
                    return;
                default:
                    System.out.println("Mời nhập lại lựa chọn: ");
                    break;

            }

        }
    }

    public static void displayFacilityMenu() throws IOException {
        FacilityServiceIplm facilityServiceIplm = new FacilityServiceIplm();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("-----------MENU-----------");
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");
            System.out.println("--------------------------");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại: ");
            }

            switch (choice) {
                case 1:
                    facilityServiceIplm.display();
                    break;
                case 2:
                    addNewFacilityMenu();
                    break;
                case 3:

                case 4:
                    return;

            }

        }
    }

    public static void addNewFacilityMenu() throws IOException {
        FacilityServiceIplm facilityServiceIplm = new FacilityServiceIplm();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("------NEW_ADD_OPTION-----");
            System.out.println("1.Add new Villa");
            System.out.println("2. Add new House");
            System.out.println("3. Add new Room");
            System.out.println("4. Return main menu");
            System.out.println("-------------------------");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại: ");
            }

            switch (choice) {
                case 1:
                    facilityServiceIplm.addNewVilla();
                    displayFacilityMenu();
                    break;
                case 2:
                    facilityServiceIplm.addNewHouse();
                    displayFacilityMenu();
                    break;
                case 3:
                    facilityServiceIplm.addNewRoom();
                    displayFacilityMenu();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Mời nhập lại lựa chọn: ");
                    break;

            }

        }
    }

    public static void displayBookingMenu() {
        BookingServiceIplm bookingServiceIplm = new BookingServiceIplm();
        ContractServiceIplm contractServiceIplm = new ContractServiceIplm();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("---MENU_BOOKING_AND_CONTRACTS---");
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new constracts");
            System.out.println("4 Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");
            System.out.println("--------------------------------");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại: ");
            }

            switch (choice) {
                case 1:
                    bookingServiceIplm.addBooking();
                    break;
                case 2:
                    bookingServiceIplm.displayBookingList();
                    break;
                case 3:
                    contractServiceIplm.creatNewContract();
                    break;
                case 4:
                    contractServiceIplm.displayListContract();
                    break;
                case 5:

                case 6:
                    return;
                default:
                    System.out.println("Mời nhập lại lựa chọn: ");
                    break;

            }
        }
    }

    public static void displayPromotionMenu() {

        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customer get voucher");
            System.out.println("3. Return main menu");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại: ");
            }

            switch (choice) {
                case 1:

            }

        }
    }

}

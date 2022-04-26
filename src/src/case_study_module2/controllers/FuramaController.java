package case_study_module2.controllers;

import case_study_module2.service.Implement.CustomerServiceIplm;
import case_study_module2.service.Implement.EmployeeServiceIplm;
import case_study_module2.service.Implement.FacilityServiceIplm;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        boolean check = true;
        while (check) {
            System.out.println("---------MENU----------");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1:
                    displayEmployeeMenu();
                    break;
                case 2:
                    displayCustomerMenu();
                    break;
                case 3:
                    displayFacilityMenu();
                    break;


            }

        }
    }

    public static void displayEmployeeMenu() {
        EmployeeServiceIplm employeeServiceIplm = new EmployeeServiceIplm();
        boolean check = true;
        while (check) {
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return main menu");
            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1:
                    employeeServiceIplm.display();
                    break;
                case 2:
                    employeeServiceIplm.addNew();
                    break;
                case 3:
                    employeeServiceIplm.edit();
                    break;

            }


        }
    }

    public static void displayCustomerMenu() {
        CustomerServiceIplm customerServiceIplm = new CustomerServiceIplm();
        boolean check = true;
        while (check) {
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");
            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1:
                    customerServiceIplm.display();
                    break;
                case 2:
                    customerServiceIplm.addNew();
                    break;

            }

        }
    }

    public static void displayFacilityMenu() {
        FacilityServiceIplm facilityServiceIplm = new FacilityServiceIplm();
        boolean check = true;
        while (check) {
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");
            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1:
                    facilityServiceIplm.display();
                    break;
                case 2:
                    addNewFacilityMenu();
                    break;

            }

        }
    }

    public static void addNewFacilityMenu() {
        FacilityServiceIplm facilityServiceIplm = new FacilityServiceIplm();
        boolean check = true;
        while (check) {
            System.out.println("1.Add new Villa");
            System.out.println("2. Add new House");
            System.out.println("3. Add new Room");
            System.out.println("4. Return main menu");
            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
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

            }

        }
    }

    public static void displayBookingMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new constracts");
            System.out.println("4 Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");
            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1:

            }

        }
    }

    public static void displayPromotionMenu() {

        boolean check = true;
        while (check) {
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customer get voucher");
            System.out.println("3. Return main menu");
            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1:

            }

        }
    }

}

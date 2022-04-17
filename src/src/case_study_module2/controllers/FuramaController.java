package case_study_module2.controllers;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1:

            }

        }
    }

    public static void displayEmployeeMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return main menu");
            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1:

            }


        }
    }

    public static void displayCustomerMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");
            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1:

            }

        }
    }

    public static void displayFacilityMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");
            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1:

            }

        }
    }
    public static void displayBookingMenu(){
        boolean check = true;
        while (check){
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new constracts");
            System.out.println("4 Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");
            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()){
                case 1:

            }

        }
}
    public static void displayPromotionMenu(){
        boolean check = true;
        while (check){
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customer get voucher");
            System.out.println("3. Return main menu");
            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()){
                case 1:

            }

        }
    }

}

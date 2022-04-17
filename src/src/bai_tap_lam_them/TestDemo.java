package bai_tap_lam_them;

import bai_tap_lam_them.Person;
import bai_tap_lam_them.Student;
import bai_tap_lam_them.Teacher;

import java.util.Scanner;

public class TestDemo {
    static Scanner sc = new Scanner(System.in);
    static Person[] arr = new Person[100];


    public static void main(String[] args) {
        Person student = new Student("Cuong", 25, true, 100);
        arr[0] = student;
        Person teacher = new Teacher("Phuong", 30, true, 5000);
        arr[1] = teacher;
        Person student1 = new Student("Huong", 22, false, 99);
        arr[2] = student1;
        Person teacher1 = new Teacher("Anh", 33, false, 6000);
        arr[3] = teacher1;

        while (true) {
            System.out.println("1. Hiển thị danh sách ");
            System.out.println("2.Thêm mới học viên: ");
            System.out.println("3. Thêm mới giáo viên: ");
            System.out.println("4. Xoá học viên trong dang sách ");
            System.out.println("5. Xoá giáo viên trong danh sách ");
            System.out.println("0. Exit ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    display();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    addTeacher();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    deleteTeacher();
                    break;
                case 0:
                    System.out.println("Exit ");
            }
        }
    }

    public static void display() {
        boolean check = true;
        while (check) {
            System.out.println("1. Hiển thị danh sách giáo viên ");
            System.out.println("2. Hiển thị danh sách học viên ");
            System.out.println("0. Trở lại! ");
            switch (Integer.parseInt(sc.nextLine())) {
                case 1:
                    choosedisplay(true);
                    break;
                case 2:
                    choosedisplay(false);
                    break;
                case 0:
                    check = false;
                    break;
                default:
                    System.out.println("Lỗi, xin nhập lại! ");
            }
        }
    }

    public static void choosedisplay(boolean choose) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (choose) {
                    if (arr[i] instanceof Teacher) {
                        System.out.println(arr[i]);
                    }
                } else {
                    if (arr[i] instanceof Student) {
                        System.out.println(arr[i]);
                    }
                }

            } else {
                break;
            }
        }
    }

    public static void addStudent() {
        System.out.println(" Nhập tên học viên: ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi học viên: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập 1:Nam    2:Nữ ");
        boolean gender = false;
        int choose = Integer.parseInt(sc.nextLine());
        if (choose == 1) {
            gender = true;
        }
        System.out.println("Nhập điểm: ");
        int point = Integer.parseInt(sc.nextLine());
        Person student = new Student(name, age, gender, point);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = student;
                break;
            }
        }
        display();
    }

    public static void deleteStudent() {
        System.out.println("Nhập tên học viên cần xóa: ");
        String name = sc.nextLine();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (arr[i].getName().equals(name) && arr[i] instanceof Student) {
                    for (int j = i; j < arr.length - 1; j++) {
                        arr[j] = arr[j + 1];
                    }
                }
            } else {
                break;
            }
        }
        display();
    }

    public static void addTeacher() {
        System.out.println(" Nhập tên giáo viên : ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi giáo viên: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập 1:Nam    2:Nữ ");
        boolean gender = false;
        int choose = Integer.parseInt(sc.nextLine());
        if (choose == 1) {
            gender = true;
        }
        System.out.println("Nhập lương: ");
        int salary = Integer.parseInt(sc.nextLine());
        Person teacher = new Teacher(name, age, gender, salary);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = teacher;
                break;
            }
        }
        display();
    }

    public static void deleteTeacher() {
        System.out.println("Nhập tên giáo viên cần xóa");
        String name = sc.nextLine();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (arr[i].getName().equals(name) && arr[i] instanceof Teacher) {
                    for (int j = i; j < arr.length - 1; j++) {
                        arr[j] = arr[j + 1];
                    }
                }
            } else {
                break;
            }
        }
        display();
    }


}



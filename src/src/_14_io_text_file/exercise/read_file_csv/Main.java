package _14_io_text_file.exercise.read_file_csv;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Country> listCountry = new ArrayList<>();
        ReadAndWrite readAndWrite = new ReadAndWrite();
        try {
            List<String[]> list = readAndWrite.readFile("src\\_14_io_text_file\\exercise\\read_file_csv\\countList.csv");

            for (String[] item : list) {
                Country country = new Country(Integer.parseInt(item[0]), item[1], item[2]);
                listCountry.add(country);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Country item : listCountry) {
            System.out.println(item);

        }
    }
}

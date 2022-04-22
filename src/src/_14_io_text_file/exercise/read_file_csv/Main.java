package _14_io_text_file.exercise.read_file_csv;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String[]> list = ReadAndWrite.readFile("src\\_14_io_text_file\\exercise\\" +
                "read_file_csv\\countryList.csv");

        List<Country> listCountry = new ArrayList<>();
        Country country;
        for (String[] item : list) {
            country = new Country(Integer.parseInt(item[0]), item[1], item[2]);
            listCountry.add(country);

        }
        for (Country item : listCountry) {
            System.out.println(item);

        }
    }
}

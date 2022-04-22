package _14_io_text_file.exercise.copy_file_text;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = ReadAndWriteFile.readFile("src\\_14_io_text_file\\exercise\\copy_file_text\\source.txt");
        for (String item : list) {
            ReadAndWriteFile.writerFile("src\\_14_io_text_file\\exercise\\copy_file_text\\target.txt", item);
        }
    }
}

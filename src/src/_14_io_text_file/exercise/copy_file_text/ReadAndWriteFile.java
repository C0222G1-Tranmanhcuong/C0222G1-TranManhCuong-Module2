package _14_io_text_file.exercise.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static List<String> readFile(String path) {
        int count = 0;
        File file = new File(path);
        FileReader fileReader;
        BufferedReader br;
        List<String> list = new ArrayList<>();
        try {

            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            fileReader = new FileReader(file);
            br = new BufferedReader(fileReader);
            String line;
            while ((line = br.readLine()) != null) {
                count += line.length();
                list.add(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Tệp nguồn không tồn tại!");
        }
        System.out.println("Số kí tự trong tệp: " + count);
        return list;
    }

    public static void writerFile(String path, String line) {
        File file = new File(path);
        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            if (file.exists()) {
                throw new ReadAndWriteFileException("Tập tin đích đã tồn tại!");
            }
        } catch ( IOException | ReadAndWriteFileException e) {
            System.out.println(e.getMessage());
        }
    }

}

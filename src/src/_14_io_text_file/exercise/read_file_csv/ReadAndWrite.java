package _14_io_text_file.exercise.read_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<String[] > readFile (String path) throws IOException{
        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<String[]> listStr = new ArrayList<>();
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine())!= null && !line.equals("")){
                String[] arrStr = line.split(",");
                listStr.add(arrStr);
            }
            return listStr;
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            bufferedReader.close();
            fileReader.close();
        }
        return null;
    }
    public static void writeFile(String path, String line) {
        File file = new File(path);

        try( FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

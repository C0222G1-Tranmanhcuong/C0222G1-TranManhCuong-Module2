package _15_io_binary_file_and_serialization.exercise.product_manager_saves_to_binary_files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileProduct {
public  List<Product> readFileBinary(String path)throws IOException {
    List<Product> productList = new ArrayList<>();
    File file = new File(path);
    FileInputStream is = null;
    ObjectInputStream ois = null;
    try {
        is = new FileInputStream(file);
        ois = new ObjectInputStream(is);
         productList= (List<Product>) ois.readObject();
    } catch (IOException | ClassNotFoundException e){
        e.printStackTrace();
    } finally {

        is.close();

        ois.close();
    }
    return productList;
}
public  void writerFileBinary(String path, List<Product> products) throws IOException {
    File file = new File(path);
    FileOutputStream os = null;
    ObjectOutputStream oos = null;
    try {
       os = new FileOutputStream(file);
       oos = new ObjectOutputStream(os);
       oos.writeObject(products);
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
       os.close();
       oos.close();
    }
}



}

package case_study_module2.service;

import java.io.IOException;

public interface Service {
    public  void display() throws IOException;

    public void addNew() throws IOException;

    public void edit() throws IOException;

    public void delete();

}

package DB;

import Org.Admin;
import Org.Employee;

import java.util.ArrayList;

public interface ISQLAdmin {
    ArrayList<Admin> get();
    void change(Employee obj);
}

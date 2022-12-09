package DB;

import java.sql.SQLException;

public abstract class AbstractFactory {
    //public abstract SQLEmployee getEmployee() throws SQLException, ClassNotFoundException;
    //public abstract SQLCustomer getCustomer() throws SQLException, ClassNotFoundException;
    public abstract SQLAuthorization getRole() throws SQLException, ClassNotFoundException;
    //public abstract SQLCourses getContract() throws SQLException, ClassNotFoundException;
    // public abstract SQLAdmin getAdmin() throws SQLException, ClassNotFoundException;
    //public abstract SQLReceive getReceive() throws SQLException, ClassNotFoundException;
}

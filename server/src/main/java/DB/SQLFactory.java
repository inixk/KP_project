package DB;

import java.sql.SQLException;

public class SQLFactory extends AbstractFactory {
    // public SQLEmployee getEmployee() throws SQLException, ClassNotFoundException {
    //     return SQLEmployee.getInstance();
    // }

    // public SQLCustomer getCustomer() throws SQLException, ClassNotFoundException {
    //     return SQLCustomer.getInstance();
    // }

    // public SQLCourses getCourse() throws SQLException, ClassNotFoundException {
    //     return SQLCourses.getInstance();
    // }

    // public SQLTimetable getTimetable() throws SQLException, ClassNotFoundException {
    //     return SQLTimetable.getInstance();
    // }

    // public SQLGroups getGroups() throws SQLException, ClassNotFoundException {
    //     return SQLGroups.getInstance();
    // }

    // public SQLAdmin getAdmin() throws SQLException, ClassNotFoundException {
    //     return SQLAdmin.getInstance();
    // }

    @Override
    public SQLAuthorization getRole() throws SQLException, ClassNotFoundException {
        return SQLAuthorization.getInstance();
    }

    // public SQLReceive getReceive() throws SQLException, ClassNotFoundException {
    //     return SQLReceive.getInstance();
    // }
}

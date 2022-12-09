package DB;

import Org.Authorization;
import Org.Role;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Types;
import java.util.ArrayList;

public class SQLAuthorization implements ISQLAuthorization {
    private static SQLAuthorization instance;
    private ConnectionDB dbConnection;

    private SQLAuthorization() throws SQLException, ClassNotFoundException {
        dbConnection = ConnectionDB.getInstance();
    }

    public static synchronized SQLAuthorization getInstance() throws SQLException, ClassNotFoundException {
        if (instance == null) {
            instance = new SQLAuthorization();
        }
        return instance;
    }

    @Override
    public boolean getRole(Authorization obj) {
        String SQL = "SELECT * FROM admin WHERE login = '" + obj.getLogin() + "' && password = '" + obj.getPassword() + "'";
        ArrayList<String []> result = ConnectionDB.getArrayResult(SQL);

        if (result.size() == 0) 
        {
            return false;    
        }
        else
        {
            return true;
        }
    }
}


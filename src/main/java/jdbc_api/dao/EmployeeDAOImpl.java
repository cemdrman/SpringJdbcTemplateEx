package jdbc_api.dao;

import model.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by cem on 9.08.2017.
 */
public class EmployeeDAOImpl implements IEmployeeDAO {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/testdb";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "";

    public void insertEmployee(Employee employee) {
        Connection connection;
        PreparedStatement preparedStatement;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            System.out.println("Connecting to a selected database...");
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");

            System.out.println("Inserting records into the table...");
            String sql = "INSERT INTO Employee VALUES (?,?,?,?)";
            preparedStatement = (PreparedStatement) connection.prepareStatement(sql);

            preparedStatement.setInt(1,employee.getId());
            preparedStatement.setString(2,employee.getName());
            preparedStatement.setString(3,employee.getSurname());
            preparedStatement.setString(4,employee.getPhone());

            preparedStatement.executeUpdate();

            System.out.println("Inserted record into the table...");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public Employee findById(int employeeId) {
        return null;
    }
}

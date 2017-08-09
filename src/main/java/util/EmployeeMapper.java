package util;

import model.Employee;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by cem on 9.08.2017.
 */

//Name?
public class EmployeeMapper implements org.springframework.jdbc.core.RowMapper<Employee> {

    public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
        Employee employee = new Employee();
        employee.setId(resultSet.getInt("id"));
        employee.setName(resultSet.getString("name"));
        employee.setSurname(resultSet.getString("surname"));
        employee.setPhone(resultSet.getString("phone"));
        return employee;
    }
}

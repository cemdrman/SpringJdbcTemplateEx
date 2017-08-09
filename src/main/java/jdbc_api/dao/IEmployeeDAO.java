package jdbc_api.dao;

import model.Employee;

/**
 * Created by cem on 9.08.2017.
 */
public interface IEmployeeDAO {

    void insertEmployee(Employee employee);
    Employee findById(int employeeId);
}

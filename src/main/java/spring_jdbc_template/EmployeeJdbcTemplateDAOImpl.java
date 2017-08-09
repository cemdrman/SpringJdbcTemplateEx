package spring_jdbc_template;

import jdbc_api.dao.IEmployeeDAO;
import model.Employee;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Created by cem on 9.08.2017.
 */
public class EmployeeJdbcTemplateDAOImpl implements IEmployeeDAO {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    public void insertEmployee(Employee employee) {

        String sql = "insert into employee (id,name,surname,phone) values (?,?,?,?)";
        jdbcTemplate.update(sql,employee.getId(),employee.getName(),employee.getSurname(),employee.getPhone());
        System.out.println("inserted record : " + employee.toString());
    }

    public Employee findById(int employeeId) {
        return null;
    }
}

package test;

import jdbc_api.dao.EmployeeDAOImpl;
import model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_jdbc_template.EmployeeJdbcTemplateDAOImpl;

/**
 * Created by cem on 9.08.2017.
 */
public class Main  {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        EmployeeJdbcTemplateDAOImpl jdbcTemplateDAO = (EmployeeJdbcTemplateDAOImpl) context.getBean("employeeJdbcTemplateDAO");
        Employee employee = new Employee(6,"cem","dırman","24234234");
        jdbcTemplateDAO.insertEmployee(employee);

        //Jdbc api

        EmployeeDAOImpl employeeDAO = new EmployeeDAOImpl();
        Employee employee1 = new Employee(2,"Emir Asaf","Al","a23423423");
        employeeDAO.insertEmployee(employee1);

    }
}

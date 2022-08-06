package Exercise3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
3. the Employee is an object that extends Person and adds two fields: company and salary.

        have a list of Employees

        3.1 extract persons that have salaries more than a specified amount

        3.2 extract a Map that gathers all the persons for a company

        3.3 calculate the sum of all salaries for all employees

        3.4 calculate which company gives the biggest salary
*/
public class Main {
    public static void main(String[] args) {

        // 3.0
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Cipri", 25, "black", "Compania 1", 2780));
        employeeList.add(new Employee("Ciprius", 33, "white", "Compania 2", 3500));
        employeeList.add(new Employee("Cipriana", 28, "blue", "Compania 3", 1950));
        employeeList.add(new Employee("Marcel", 36, "blonde", "Compania 2", 3150));
        employeeList.add(new Employee("Marcelus", 46, "black", "Compania 1", 2500));
        employeeList.add(new Employee("Marcelana", 34, "brown", "Compania 3", 3370));
        employeeList.add(new Employee("Marc", 53, "brown", "Compania 3", 3000));
        employeeList.add(new Employee("Marcus", 31, "black", "Compania 1", 2700));
        employeeList.add(new Employee("Marcusa", 23, "blonde", "Compania 2", 2990));

        // 3.1
        System.out.println(salaryHigherThan(3000, employeeList));

        // 3.2
        System.out.println(mapCompanyToPerson(employeeList));

        // 3.3
        System.out.println(salarySum(employeeList));

        // 3.4
        System.out.println(highestSalaryCompany(employeeList));
    }

    // 3.1
    public static List<Employee> salaryHigherThan(int salary, List<Employee> employeeList) {
        List<Employee> listSalaryHigherThan = new ArrayList<>();
        for (Employee employee : employeeList) {
            if (employee.getSalary() > salary) {
                listSalaryHigherThan.add(employee);
            }
        }
        return listSalaryHigherThan;
    }

    // 3.2
    public static Map<String, List<Employee>> mapCompanyToPerson(List<Employee> employeeList) {
        Map<String, List<Employee>> mapCompanyToPerson = new HashMap<>();
        for (Employee employee : employeeList) {
            List<Employee> employeesOfACompany = mapCompanyToPerson.get(employee.getCompany());
            if (employeesOfACompany == null) {
                employeesOfACompany = new ArrayList<>();
                mapCompanyToPerson.put(employee.getCompany(), employeesOfACompany);
            }
            employeesOfACompany.add(employee);
        }
        return mapCompanyToPerson;
    }

    // 3.3
    public static int salarySum(List<Employee> employeeList) {
        int sum = 0;
        for (Employee employee : employeeList) {
            sum += employee.getSalary();
        }
        return sum;
    }

    // 3.4
    public static String highestSalaryCompany(List<Employee> employeeList) {
        int highestSalary = 0;
        String companyName = null;
        for (Employee employee : employeeList) {
            if (highestSalary < employee.getSalary()) {
                highestSalary = employee.getSalary();
                companyName = employee.getCompany();
            }
        }
        return companyName;
    }
}

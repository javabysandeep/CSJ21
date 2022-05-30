package collectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOfEmployees {
    public static void main(String[] args) {
        Employee employee1 = new Employee(101, "Mangesh",234000);
        Employee employee2 = new Employee(122, "Anjali",43500);
        Employee employee3 = new Employee(120, "Rasika",43700);
        Employee employee4 = new Employee(1, "Bhavesh",33000);

        List<Employee> employeeList = new ArrayList();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

        //sort ---> Comparable,
        Collections.sort(employeeList);

        for (Employee employee:employeeList) {
            System.out.println(employee);
        }


    }
}

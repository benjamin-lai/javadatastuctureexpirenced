package practiseBen;

import lists.classes.Employee;

import java.util.ArrayList;
import java.util.List;

public class Second {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));
        employeeList.add(new Employee("Saad", "", 7777));


        for (Employee view:employeeList) {
            System.out.println(view.getFirstName());
            System.out.println(view);
        }
//        System.out.println(employeeList.get(4));
//        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));
//        System.out.println(employeeList.contains(new Employee("Mary", "Smith",21)));
//        System.out.println(employeeList.indexOf(new Employee("Mary", "Smith", 22)));

//        employeeList.forEach(employee -> System.out.println(employee));
    }
}

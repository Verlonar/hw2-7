package ru.verlonar.hw27.service;

import ru.verlonar.hw27.data.Employee;

import java.util.List;

public interface EmployeeService {

    Employee addEmployee(String firstName, String lastName);

    Employee deleteEmployee(String firstName, String lastName);

    Employee findEmployee(String firstName, String lastName);

    List<Employee> showAll();
}

package ru.itsrv23.hw210.service;


import ru.itsrv23.hw210.entity.Employee;

public interface EmployeeService {
    Employee addEmployee(String firstName, String lastName, String patronymic, Integer salary, Integer department);
    Employee deleteEmployee(String firstName, String lastName,String patronymic);
    Employee findEmployee(String firstName, String lastName, String patronymic);
    String getFIO(String firstName, String lastName, String patronymic);
}

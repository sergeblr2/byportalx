package by.controllers;

import by.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PortalRestController {

    @GetMapping("/hello")
    public String homePage() {
        System.out.println("hello - проверка вывода в консоль надписи из вкладки /hello");
        String someString = "проверка работоспособности ";
        return someString + " 5";
    }
    @GetMapping("/person")
    public Employee getEmployee() {
        Employee person1 = new Employee("Сергей", "Иванюклвич", 35, "TeamLid");
        return person1;
    }
    @GetMapping("/persons")
    public List<Employee> getEmployees() {
        List<Employee> persons = new ArrayList<>();
        persons.add(new Employee("Островский", "Руслан", 37, "Developer"));
        persons.add(new Employee("Левченко", "Александр", 36, "Junior"));
        persons.add(new Employee("Рагозинский", "Алексей", 35, "Junior"));
        persons.add(new Employee("Якимчик", "Александр", 34, "Junior"));
        persons.add(new Employee("Савицкий", "Владимир", 38, "Junior"));
        return persons;
    }

}

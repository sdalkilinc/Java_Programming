package day32_finalKeyword.personTask;

import java.time.LocalDate;

public class TestPersonObject {
    public static void main(String[] args) {

        Person person = new Person("Daniel", 'M', LocalDate.of(1991, 1,25));

        person.breath();

        System.out.println(person);

        System.out.println("--------------------");

        Employee employee = new Employee("Emily", 'F', LocalDate.of(1989,2,5), "Acuntat", 100000);

        System.out.println(employee);

        employee.breath();



    }
}

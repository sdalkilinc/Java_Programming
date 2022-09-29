package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObjects {
    public static void main(String[] args) {

        Person[] people = {new Person(), new Person(), new Person(), new Person(), new Person()};

        people[0].setInfo("Daniel", 'M', LocalDate.of(1989, 2, 25));
        people[1].setInfo("Muhtar", 'M', LocalDate.of(1981, 3, 25));
        people[2].setInfo("Bella", 'F', LocalDate.of(1960, 1, 5));
        people[3].setInfo("Yulia", 'F', LocalDate.of(1989, 1, 25));
        people[4].setInfo("Ali", 'M', LocalDate.of(1983, 2, 25));

        ArrayList<Person> studentList = new ArrayList<>();
        studentList.addAll(Arrays.asList(people));


        for (Person person : studentList) {
            System.out.println(person.name + " : " + person.dateOfBirth);
        }

        System.out.println("______________________________________________________________");

        studentList.removeIf(person -> person.age > 55);

        for (Person person : studentList) {
            System.out.println(person.name + " : " + person.age);
        }

        //print name & date of birth of each person object
        // remove all the person object that has the age >55


    }
}

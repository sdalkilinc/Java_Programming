package day25_constructor;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;

public class Task2 {
    public static void main(String[] args) {

        String [] names={"Diana", "Igor", "Abidullah", "Vasyl", "Ahmet"};
        LocalDate [] birthdays={LocalDate.of(2010,1,1), LocalDate.of(1980,1,1),LocalDate.of(1985,1,1),LocalDate.of(1855,1,1),LocalDate.of(2018,1,1)};


        LocalDate max= Collections.max(Arrays.asList(birthdays));
        System.out.println(max);
        boolean isLeapyear=max.isLeapYear();
        int indexofName=0;

        for (int i = 0; i < birthdays.length; i++) {
            if(birthdays[i]==max){
                indexofName=i;
            }if(birthdays[i].isLeapYear()){
                System.out.println(names[i]+" was born during a leap year");
            }
        }
        System.out.println(" The youngest person is "+names[indexofName]);
    }

    }


/*
Task02:
    1. create string array to have 5 of your classmate's names

    2. create an array that contains their date of birth

    3. find out who is the youngest person

    4. find out who was born on leap year
 */
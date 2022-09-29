package day25_constructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task1 {
    public static void main(String[] args) {

        LocalDateTime myDate=LocalDateTime.of(2020, 11,24,13,00);

        DateTimeFormatter df =DateTimeFormatter.ofPattern("eeee, h:mm a, MMM/dd/Y");

        System.out.println(myDate.format(df));

    }
}

/*
 use the LocalDateTime get the date and time in the following format:
            Tuesday, 1:00 pm, Nov/24/2020
 */
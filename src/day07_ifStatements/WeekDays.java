package day07_ifStatements;

public class WeekDays {
    public static void main(String[] args) {

        int number = 8;

        String nameOfTheDay = "";

        if (number == 1) {
            nameOfTheDay = "Monday";
         } else if (number == 2) {
            nameOfTheDay = "Tuesday";
        } else if (number == 3) {
            nameOfTheDay = "Wednesday";
        } else if (number == 4) {
            nameOfTheDay = "Thursday";
        } else if (number == 5) {
            nameOfTheDay = "Friday";
        } else if (number == 6) {
            nameOfTheDay = "Saturday";
        } else if (number == 7) {
            nameOfTheDay = "Sunday";
        } else {
            nameOfTheDay = "Invalid";
        }

        System.out.println(nameOfTheDay);

    }
}

/*
1. Create a class named WeekDays.java
2. An integer variable named number is declared and given,
Write a program that can print the name of the day that the number represents.
Ex: Given:
number = 1
output: Monday
Note: Assume that the given number is between 1 ~ 7
 */
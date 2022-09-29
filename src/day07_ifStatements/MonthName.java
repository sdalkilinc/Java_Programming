package day07_ifStatements;

public class MonthName {
    public static void main(String[] args) {

        int number = 5;
        String nameOfMonth = "";

        if (number == 1) {
            nameOfMonth = "January";
        } else if (number == 2) {
            nameOfMonth = "February";
        } else if (number == 3) {
            nameOfMonth = "March";
        } else if (number == 4) {
            nameOfMonth = "April";
        } else if (number == 5) {
            nameOfMonth = "May";
        } else if (number == 6) {
            nameOfMonth = "June";
        } else if (number == 7) {
            nameOfMonth = "July";
        } else if (number == 8) {
            nameOfMonth = "August";
        } else if (number == 9) {
            nameOfMonth = "September";
        } else if (number == 10) {
            nameOfMonth = "October";
        } else if (number == 11) {
            nameOfMonth = "November";
        } else if (number == 12) {
            nameOfMonth = "December";
        } else {
            nameOfMonth = "Invalid";
        }

        System.out.println(nameOfMonth);
    }
}

/*
1. Create a class named MonthName.java
2. An integer variable named number is declared and given, Write a
program that can print the name of the month that the number
represents.
Ex: Given:
number = 10
output: October
Note: Assume that the given number is between 1 ~ 12
 */
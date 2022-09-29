package day07_ifStatements;

public class GradeReportSumeye {

    public static void main(String[] args) {


    int score = 45;
    String result = "Your grade is "; //If you want to add a sentence, then use += in your result part

        if (score >=90 ){
        result += "A";
    } else if (score >=80 && score < 90) {
        result += "B";
    } else if (score >=70 && score < 80) {
        result += "C";
    } else if (score >=60 && score < 70) {
        result += "D";
    } else {
        result += "F";
    }

        System.out.println(result);

    }

}


/*
1. Create a class named GradeReport.java
2. An integer variable named score is declared and given,
Write a program that can print the grade of the student
Ex:
score = 95
output:
Your grade is A
Note: Assume that the given score is between 0 ~ 100
 */



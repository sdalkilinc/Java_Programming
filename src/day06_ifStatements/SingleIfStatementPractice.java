package day06_ifStatements;

public class SingleIfStatementPractice {

    public static void main(String[] args) {

        int number = 100;

        boolean isEven = number % 2 == 0;

        if (isEven) {
            System.out.println("Even number");
        }

        if (!isEven) {
            System.out.println("Odd Number");
        }

        System.out.println("________________________________________");

        if(number % 2 == 0 ) {
            System.out.println("Even number");
        }

        if (number % 2 != 0 ) {
            System.out.println("Odd Number");
        }



    }
}
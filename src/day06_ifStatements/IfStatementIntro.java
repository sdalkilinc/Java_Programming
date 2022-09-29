package day06_ifStatements;

public class IfStatementIntro {
    public static void main(String[] args) {

        int number = 0;

        boolean isPositive = number > 0 ;
        if(isPositive) {
            System.out.println(number + " is positive number");
        }

        boolean isNegative = number < 0;
        if (isNegative) {
            System.out.println(number + " is negative number");
        }

        boolean isZero = number == 0;
        if (isZero){
            System.out.println(number + " is zero");
        }

        System.out.println("_____________________________________________________");

        int num = 100;

        if (num > 0) {
            System.out.println(num + " is positive");
        }

        if (num < 0) {
            System.out.println(num + " is negative");
        }

        if (num == 0) {
            System.out.println(num + " is zero");
        }

    }

}

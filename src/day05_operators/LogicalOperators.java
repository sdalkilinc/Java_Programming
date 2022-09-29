package day05_operators;

public class LogicalOperators {
    public static void main(String[] args) {

        double salary = 60000;
        int creditScore = 650;
        int age = 42;

        boolean eligibleForLoan = salary >= 30000 && creditScore >= 650 && age >= 18;

        System.out.println(eligibleForLoan);

        System.out.println("_____________________________________________________");

        age = 32;
        String country = "China";

        boolean eligibleToVote = age >= 18 || country == "USA";

        /* || (or) assigment return if one
        of them is correct
         */

        System.out.println(eligibleToVote);

        System.out.println("___________________");

        country = "Australia";

        boolean nativeEnglishSpeaker = country == "Canada" || country == "USA" || country == "UK" || country == "Australia";
        //                              false              || false            || false           || true

        System.out.println("nativeEnglishSpeaker = " + nativeEnglishSpeaker);

        System.out.println("____________________________________");

        String answer = "maybe";
        boolean validAnswer = answer == "yes" || answer == "no";
        System.out.println(validAnswer);

        System.out.println("____________________________________");

        char grade = 'A';
        boolean passedTheExam = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D';

        System.out.println(passedTheExam);

        System.out.println("____________________________________");

        System.out.println(!true);

        String a = "yes";
        boolean yes = a == "yes";

        System.out.println("____________________________________");

        System.out.println( true == !false && false == !true && true != !true);
        //                     true        &&      true      &&   true





    }
}

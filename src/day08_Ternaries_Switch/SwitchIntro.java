package day08_Ternaries_Switch;

public class SwitchIntro {
    public static void main(String[] args) {

        char grade = 'Q';
        /*
            'A': Excellent
            'B': Great job
            'C': Good
            'D': Passed
            'F': Failed
         */

        /* String result = "";

        if (grade == 'A') {
            result = "Excellent";
        } else if (grade == 'B'){
            result = "Great job";
        } else if (grade == 'C'){
            result = "Good";
        } else if (grade == 'D'){
            result = "Passed";
        }else {
            result = "Failed";
        }

        System.out.println(result);

         */

        System.out.println("____________________________________________________");

        switch (grade) {

            case 'A':
                System.out.println("Excellent");
                break; // If you don't add break, you will get logical error

            case 'B':
                System.out.println("Great job");
                break;

            case 'C':
                System.out.println("Good");
                break;

            case 'D':
                System.out.println("Passed");
                break;

            case 'F':
                System.out.println("Failed");
                break;

            default:
                System.out.println("Invalid");
                break;

        }
    }
}

package day08_Ternaries_Switch;

public class SwitchStatementIntro2 {
    public static void main(String[] args) {
        int n = 5;

        String day = "";

       switch (n) {

           case 1:
               System.out.println("Monday");
               break;

           case 2:
               System.out.println("Tuesday");
               break;

           case 3:
               System.out.println("Wednesday");
               break;

           case 4:
               System.out.println("Thursday");
               break;

           case 5:
               System.out.println("Friday");
               break;

           case 6:
               System.out.println("Saturday");
               break;

           case 7:
               System.out.println("Sunday");
               break;

           default:
               System.out.println("Invalid Day");

       }

       /*
       case 'A':
                System.out.println("Excellent");
                break; // If you don't add break, you will get logical error
        */


    }
}

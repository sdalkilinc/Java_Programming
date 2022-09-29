package day15_whileLoop;

public class BreakStatement {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if (i == 6) {
                break;
            }
            System.out.println(i);
        }


        System.out.println("________________________________");

        for (char i = 'A'; i<= 'Z';i++){
            System.out.println(i);

            if (i=='J'){
                System.out.println("Loop is terminated");
                break;

            }

        }

        System.out.println("________________________________");

        for (;;){
            System.out.println("Hello");
            break;
        }



    }
}

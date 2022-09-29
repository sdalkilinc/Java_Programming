package day15_whileLoop;

public class ContinueStatement {
    public static void main(String[] args) {

        for (int i = 1; i <6 ; i++) {

            if (i == 2){
                continue;
            }
            System.out.println(i);
        }

        System.out.println("___________________________________________");

        for (int i = 10; i < 21; i++) {
            if(i%2 ==0){ //if i is even
                continue; //skips the current iteration
            }

            System.out.println(i);
        }

        System.out.println("___________________________________________");

        for (char i = 'A'; i <= 'G'; i++ ){ // i: A, B, C, D, E, F, G

            if(i== 'B' || i == 'E'){
                continue;
            }
            System.out.println(i);
        }

        System.out.println("___________________________________________");

        /*
        for (int i = 0; i < 10 ; i++)
            System.out.println("Hello World");
        System.out.println("Hello Cydeo");

         */




    }
}

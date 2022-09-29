package day16_nestedLoop;

public class DoWhileLoop {
    public static void main(String[] args) {


        boolean condition = false;

        for (; condition; ) {
            System.out.println("Hello Cydeo");
        }


        System.out.println("____________________________________");

        while (condition){
            System.out.println("Hello Cydeo ------ While Loop");
        }

        System.out.println("____________________________________");

        do {
            System.out.println("Hello Cydeo ------ Do&While Loop");
        }while (condition);



    }
}

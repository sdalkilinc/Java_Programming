package day32_finalKeyword.carTask_methodOverriding;

public class TestCarObject {
    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry", "Blue", 2020, 2500);

        Honda honda = new Honda("Accord", "grey", 2019, 2400);

        Audi audi = new Audi("Q6", "silver", 2021, 5000);

        BMW bmw = new BMW("X6", "black", 2017, 45000);

        Tesla tesla = new Tesla("Model 3", "White", 2022, 65000);

        System.out.println(toyota);
        System.out.println(honda);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(tesla);

        System.out.println("---------------------------------------------------------");

        toyota.start();
        honda.start();
        audi.start();
        bmw.start();
        tesla.start();

        System.out.println("---------------------------------------------------------");

         //tesla.setPrice(30000);
         //tesla.setModel("Model H");
        System.out.println(tesla);


    }
}

package day37_exceptions;

import day36_polymorphism.Circle;

public class TestPizzaObjects {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza('S', 2, 3);

        Pizza pizza2 = new Pizza('S', 2, 3);

        System.out.println( pizza1 ==pizza2 ); //false

        System.out.println(pizza1.equals(pizza2)); //true

        // System.out.println(pizza1.equals("Pizza")); //Invalid object: Pizza

        Object obj = (Object) new Pizza('S',4,3);//upcasting

        boolean r = obj.equals(pizza2);

        System.out.println(r);

        double total = ((Pizza)obj).calcCost();

        System.out.println(total);

        //double area = ( (Circle) obj).area();

        //System.out.println(area);

        System.out.println("test completed");







    }
}

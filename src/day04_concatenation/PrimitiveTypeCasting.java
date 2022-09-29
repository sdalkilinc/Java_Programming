package day04_concatenation;

public class PrimitiveTypeCasting {

    public static void main(String[] args) {

        // ------ Implicit Casting ---------]

        byte a = 15;

        short b = a;

        //short b = (short)a;

        int c = (byte)a; //implicit casting - smaller to larger

        System.out.println(b);

        long d = 3000L;

        float f = d; //implicit casting

        // ------ Explicit Casting ---------]

        int x = 100;

        byte y = (byte)x; //explicit casting

        float z = 20.8f;

        short q = (short) z; // z = 20.8

        System.out.println(q);

        double n1=2.5;
        byte n2 = (byte) n1; // n1 = 2.5

        System.out.println(n2);

        System.out.println("--------------------------");

        int num = 500;

        byte result = (byte)num; // explicit casting

        System.out.println(result);

        int r = 5000;

        short t = (short) r;

        System.out.println(t);

        System.out.println("------------------");

        double u = 3000.5;

        int p = (int) u;

        System.out.println(p);

        int o = 100;

        double d1 = o;

        System.out.println(d1);

























    }


}

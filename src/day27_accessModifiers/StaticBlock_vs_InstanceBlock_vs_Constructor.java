package day27_accessModifiers;

public class StaticBlock_vs_InstanceBlock_vs_Constructor {

    public StaticBlock_vs_InstanceBlock_vs_Constructor(){ //Constructor's execution it depends on the object
        System.out.println("Constructor");
    }

    { //instance block executes it depends on the variable
        System.out.println("Instance Block");
    }

    static { //Static block only executes one time
        System.out.println("Static Block");
    }

    public static void main(String[] args) {

        System.out.println("Main method");

        new StaticBlock_vs_InstanceBlock_vs_Constructor();
        new StaticBlock_vs_InstanceBlock_vs_Constructor();




    }
}

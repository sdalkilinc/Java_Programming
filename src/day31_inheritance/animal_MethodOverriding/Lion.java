package day31_inheritance.animal_MethodOverriding;

public class Lion extends Animal{


    private boolean isAfricanlion;

    public Lion(String name, String breed, char gender, int age, String size, String color, boolean isAfricanlion) {
        super(name, breed, gender, age, size, color);
        setAfricanlion(isAfricanlion);
    }

    public boolean isAfricanlion(){
        return isAfricanlion;
    }

    public void setAfricanlion(boolean africanlion){
        isAfricanlion = africanlion;
    }

    @Override
    public void eat() {
        System.out.println("Lion " + getName() + " is eating deer");
    }

    public void roar(){
        System.out.println("Lion " + getName() + " is roaring");
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", African Lion='" + isAfricanlion + '\'' +
                '}';
    }
}

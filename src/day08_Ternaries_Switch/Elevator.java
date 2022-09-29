package day08_Ternaries_Switch;

public class Elevator {
    public static void main(String[] args) {

        int floorNumber = 3;

        String result = "Invalid floor";

        if (floorNumber >= 1 && floorNumber <=3) {

            result = "Floor " + floorNumber + " is selected. Companies: ";

            if (floorNumber== 1) {
                result += "Lobby, Verizon, Starbucks";
            } else if (floorNumber ==2) {
                result += "Cydeo, NASA, Intelsat";
            } else {
                result += "Lyft, BofA, Stake house";
            }

        }

        System.out.println(result);
    }
}


/*
Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"

			when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"

			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"

			 anything else: print "Invalid floor - 6"



 */
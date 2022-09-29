package day15_whileLoop;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "eeefffrrrr";

        String result = ""; //"abc"

        for (int i = 0; i < str.length(); i++) { //i: index numbers of str

            char each = str.charAt(i); //each character of the String str

            if (!result.contains("" + each)){ //If the string result does not contain the character of string str yet
                // ((((When you add this: "" + in front of any data type, then it is gonna be String))))
                result += each; // then we will add the character to string result
            }

            //If the character is not contained yet in the new string, then we will add it to the new string

        }

        System.out.println(result);
    }
}

/*
Write a program that can remove the duplicated characters from a string

                Ex:
                    str = "aabbbcccc"

                    output:
                        abc
 */
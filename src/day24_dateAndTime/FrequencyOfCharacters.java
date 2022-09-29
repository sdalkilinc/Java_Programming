package day24_dateAndTime;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aaabbbbccccc"; //a3b4c5

        String result = "";

        for (String each : str.split("")) {
            int frequecny = Collections.frequency( Arrays.asList(str.split("")), each);
            if (!result.contains(each)){
                result += each + frequecny;
            }

        }

        System.out.println(result);


    }
}

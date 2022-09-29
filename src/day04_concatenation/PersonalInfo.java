package day04_concatenation;

/*
1. Create a class named PersonalInfo, and declare the variables with the appropriate for the followings:
            1. first name
            2. last name
            3. gender
            4. age
            5. from
            6. favorite music
            7. favorite book
            8. favorite show
            9. favorite color
            10. married status
 */

public class PersonalInfo {

    public static void main(String[] args) {

        String firstName = "Sumeye",
                lastName = "Dalkilinc",
                from = "Turkey",
                favoriteMusic ="I will survive",
                favorite_book = "Outliers",
                favorite_show = "Homeland",
                favorite_color = "Black";
        char gender = 'F';
        int age = 35;
        Boolean isMarried = true,
                isEmployeed = false;

        // String from = "USA";

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("gender = " + gender);
        System.out.println("age = " + age);
        System.out.println("from = " + from);
        System.out.println("favoriteMusic = " + favoriteMusic);
        System.out.println("favorite_book = " + favorite_book);
        System.out.println("favorite_show = " + favorite_show);
        System.out.println("favorite_color = " + favorite_color);
        System.out.println("isMarried = " + isMarried);
        System.out.println("isEmployeed = " + isEmployeed);
    }

}

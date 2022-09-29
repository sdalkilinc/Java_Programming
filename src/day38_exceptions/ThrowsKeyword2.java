package day38_exceptions;

import utilities.Library;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword2 {
    public static void main(String[] args) {


        Library.sleep(5000);

    }

    public static void pauseFor5seconds() throws InterruptedException{

            Thread.sleep(5000);

    }

    public static void method1() throws InterruptedException {
        System.out.println("Hello World");
        pauseFor5seconds();
        System.out.println("Hello Cydeo");
    }

    public static void method2() throws InterruptedException, FileNotFoundException {
        System.out.println("First program started");

        Thread.sleep(3000);

        System.out.println("First program ended");

        new FileInputStream(" ");

        Thread.sleep(5000);
    }



}

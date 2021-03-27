package org.launchcode.java.demos.lsn1datatypes;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        double fahrenheit;
        double celsius;
        //so line 10 here tells the compiler that input var is of type Scanner.
        Scanner input;
        //then the next line says it's an instance of Scanner with the parameter of System.in.
        //so my prediction is that "scanner" waits for input, and the param you pass it tells it WHERE to listen for input.
        //system.in tells it to listen on the terminal prompt.
        input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        //and then input.nextDouble() listens for the next double type input
        fahrenheit = input.nextDouble();
        //and .close() says "stop listening for input.
        input.close();

        celsius = (fahrenheit - 32) * 5/9;
        System.out.println("The temperature in Celsius is: " + celsius + "°C");
    }
}

package org.launchcode.java.demos;

/**
 * From "Java Web Development"
 */
public class Hello {
    //must call the var static in order to use it in static context.
    //static final String name = "Buttface";
    public static void main(String[] args) {
        //don't need to use static if defined inside the main method. So Hello class has the .main method
        // which is public and static and returns void. if you want to define a var in the class Hello and use it in
        //the method you have to call it static
        String name = "Buttface";
        System.out.println("Hello, " + name);
    }
}

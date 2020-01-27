package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

    //Primitive data types:

	// byte
    // short
    // int
    // long
    // float
    // double
    // char
    // boolean

    /* The String is a data type in Java, which is not a primitive type. It's actually a Class,
       but it enjoys a bit of favoritism in Java to make it easier to use than a regular class.*/
    String myString = "This is a string";
    System.out.println("myString is equal to " + myString);
    myString = myString + " , and this is more.";
    System.out.println("myString is equal to " + myString);
    myString = myString = " \u00A9 2020";
    System.out.println("myString is equal to " + myString);
    String numberString = "250.55";
    numberString = numberString + "49.95";
    System.out.println(numberString);
    String lastString = "10";
    int myInt = 50;
    lastString = lastString + myInt;
    System.out.println("LastString is equal to " + lastString);
    double doubleNumber = 120.47d;
    lastString = lastString + doubleNumber;
    System.out.println("LastString is equal to " + lastString);

    }
}

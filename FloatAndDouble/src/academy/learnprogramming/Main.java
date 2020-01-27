package academy.learnprogramming;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// Float and Double

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f; // Cast float if using decimal as the value.. floats are generally not recommended! Doubles are preferred.
        double myDoubleValue = 5.0 / 3d; // Do not have to use the "d" but it is good practice
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        double numberOfPounds = 210d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted Kilograms = " + convertedKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d; // might see underscores in the wild but the compter does not read the underscores
        System.out.println(pi);
        System.out.println(anotherNumber);

        /* It is not good practice to use floating-point types to perform precise calculations.
        Java has a class called BigDecimal that overcomes a limitation with how floating point
        numbers are stored, (which is not a Java problem as such).
        For general calculations double is fine (float is not really used).
         */
    }
}

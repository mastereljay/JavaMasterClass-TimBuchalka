public class Main {

    public static void main(String[] args) {
	// Operator Challenge - Last challenge from lesson 39 in Tim Buchalka's Java Masterclass on Udemy

        /*
            Testing what I have learned about Java operators
                1. Create a double variable with a value of 20.0
                2. Create a second double variable with a value of 80.0
                3. Add both numbers together and multiply by 100
                4. Use a remainder operator to find the remainder of step 3, and 40.0.
                5. Create a boolean variable that is true if step 4 is equal to 0, false if != 0.
                6. Output the boolean variable
                7. Write an if-then statement that display's a message "Got some remainder" if step 5 is false.
         */

        double firstDouble = 20.0d;
        double secondDouble = 80.0d;
        double firstSum = firstDouble + secondDouble * 100.0d;
        System.out.println("firstSum = " + firstSum);
        double firstModulo = firstSum % 40.0d;
        System.out.println("firstModulo = " + firstModulo);
        boolean firstBoolean = (firstModulo == 0) ? true : false;
        if (firstBoolean == false) {
            System.out.println("Got some remainder");
        }
    }
}

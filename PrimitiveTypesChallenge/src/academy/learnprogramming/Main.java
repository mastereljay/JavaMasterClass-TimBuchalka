package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        //Primitive Types Challenge

        byte newByteNumber = 88;
        short newShortNumber =31888;
        int newIntNumber = 208888888;

        long newLongNumber = (500000L + 10L * (newByteNumber + newShortNumber + newIntNumber));
        System.out.println(newLongNumber);

        short shortTotal = (short) (1000 + 10 * (newByteNumber + newShortNumber + newIntNumber));
    }
}

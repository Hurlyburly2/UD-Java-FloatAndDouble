package com.dsimon;

public class Main {

    public static void main(String[] args) {
        // width of in = 32 (4 bytes)
	    int myIntValue = 5 / 3;
	    // width of float = 32 (4 bytes)
	    float myFloatValue = 5f / 3f;
	    // width of double = 64 (8 bytes) (mostly use double over float)
	    double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        // Convert a given number of pounds to kilograms
        // 1.   Create a variable to store the number of pounds
        // 2.   Calculate the number of Kilograms for the number above and store it in a variable
        // 3.   Print out the result

        // NOTE:    1 pound is equal to 0.45359237 kilograms

        double kiloGramConversion = 0.45359237d;

        double numberOfPounds = 10d;
        double numberOfKilograms = numberOfPounds * kiloGramConversion;

        System.out.println(numberOfPounds + " Pounds = " + numberOfKilograms + " Kilograms");
    }
}

package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float Min_float_value = Float.MIN_VALUE;
        float Max_float_value = Float.MAX_VALUE;
        System.out.println("float minimum value = " + Min_float_value);
        System.out.println("Float maximum value = " + Max_float_value);

        double Min_double_value = Double.MIN_VALUE;
        double Max_double_value = Double.MAX_VALUE;
        System.out.println("double minimum value = " + Min_double_value);
        System.out.println("double maximum value = " + Max_double_value);

//        int myIntValue = 5;
//        float myFloatValue = (float)5.25; //or and reccomended 5.25f
//        double myDoubleValue = 5.25; //or 5.25d

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("MyIntValue=" + myIntValue);
        System.out.println("MyFloatValue=" + myFloatValue);
        System.out.println("MyFloatValue=" + myDoubleValue);

        //challenge 1
        double lb =10;
        double KG = 0.45359237;
        double tot = lb * KG;

        System.out.println("Converted KG" + tot);
    }
}

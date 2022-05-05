package com.technews.technewsjavaapi;

public class VariableTypes {
    public static void main(String[] args) {

        int valueOne = 10;
        double valueTwo = 10.50;
        String item = "tacos";

        //because the math includes a double, the sum must be double
        double sum = valueOne + valueTwo;

        //once again, if the sum includes a string, it must also be a string
        String itemValue = item + valueOne;

        System.out.println(sum);
        System.out.println(itemValue);
    }
}

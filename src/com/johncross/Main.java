package com.johncross;

public class Main {

    public static void main(String[] args) {

        int myVariable = 50;  //the entire line is a statement
        if (myVariable == 50)
            System.out.println("Printed");
        myVariable++;
        myVariable--; //these are also statements
        System.out.println("This is a test"); //this is also a statement

        System.out.println("This is " +
                "another " +              //white space is ignored
                "still more.");

        int anotherVariable = 50;
        myVariable--;
        System.out.println("This also works"); //this is also valid but not recommended


    }
}

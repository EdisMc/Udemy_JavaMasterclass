package com.company;

public class Letters {
    public static void main(String[] args) {
        char letter = 'C';

        switch (letter) {
           /* case 'A':
                System.out.println("The letter is A");
                break;

            case 'B':
                System.out.println("The letter is B");
                break;

            case 'C':
                System.out.println("The letter is C");
                break;

            case 'D':
                System.out.println("The letter is D");
                break;*/
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println(letter + " was found");
                break;

            default:
                System.out.println("Not found!");
                break;
        }

        String month = "FEbRUAry";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;

            case "february":
                System.out.println("Feb");
                break;

            case "march":
                System.out.println("March");
                break;

            case "april":
                System.out.println("April");
                break;

            default:
                System.out.println("Not sure");
        }
    }
}

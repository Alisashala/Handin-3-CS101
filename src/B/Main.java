package B;

import java.util.Scanner;
// B: Write a method that returns if a user has input a valid CPR number.

public class Main {
    public static void main(String[] args) {
        // B: Creating a scanner for method

        Scanner scanInt = new Scanner(System.in); //Scanneren bruges til at scanne/læse det tal som indsættes i inputfeltet
        System.out.println("Enter your CPR number:");
        String cprNr = scanInt.next();
        System.out.println(cprNumber(cprNr));
    }

    public static boolean cprNumber(String cprNr) {
        if (cprNr.length() == 10) {
            return true;
        }

        int day = Integer.parseInt(cprNr.substring(0, 2));
        int month = Integer.parseInt(cprNr.substring(2, 4));

        if (day <= 31) {
            return true;
        }

        if (month <= 12) {
            return true;

        } else {
            return false;
        }
    }
}

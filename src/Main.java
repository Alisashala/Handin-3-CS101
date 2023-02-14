import C.Article;
import D.Square;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

    // D: Sort a list of squares using collections.sort();

        ArrayList<Square> newSquares = new ArrayList<>();

        newSquares.add(new Square(2.13, 3.5));
        newSquares.add(new Square(4.5, 7.8));
        newSquares.add(new Square(1.0, 4.7));
        Collections.sort(newSquares);

        for (Square square : newSquares) {
            System.out.println("Perimeter: " + square.getPerimeter());
        }



    // C: Create 5 articles, add them into an ArrayList and print them by overriding the .toString() method

        ArrayList<Article> newArticles = new ArrayList<>();

        newArticles.add(new Article("Julie Petersen", "Sygeplejersken"));
        newArticles.add(new Article("Jakob Christiansen", "Bilen flyver"));
        newArticles.add(new Article("Alisa Hejazi", "Oplevelsen i bussen"));
        newArticles.add(new Article("Nadine Shala", "Rygning dræber"));
        newArticles.add(new Article("Azra Bagaeva", "Sangen hittede"));
        System.out.println(newArticles);


    // B: Creating a scanner for method

        Scanner scanInt = new Scanner(System.in); //Scanneren bruges til at scanne/læse det tal som indsættes i inputfeltet
        System.out.println("Enter your CPR number:");
        String cprNr = scanInt.next();
        System.out.println(cprNumber(cprNr));


    // A: Call the method 10 times by using a loop

        for (int i = 0; i < 10; i++) {
            int randomNumber = getRandomNumber();
            System.out.println(randomNumber);
        }

    }

    // A: Write a method that returns a random number between 1-10.
    public static int getRandomNumber() {
        Random random = new Random();
        int x = random.nextInt(10) + 1;
        return x;
    }

    // B: Write a method that returns if a user has input a valid CPR number.
    public static boolean cprNumber(String cprNr) {
        if (cprNr.length() == 10) {
            return true;
        }

        int day = Integer.parseInt(cprNr.substring(0, 2));
        int month = Integer.parseInt(cprNr.substring(2, 4));

        if (day <= 31 ) {
            return true;
        }

        if (month <= 12) {
            return true;
            
        } else {
            return false;
        }

    }
}

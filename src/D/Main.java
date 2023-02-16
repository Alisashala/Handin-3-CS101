package D;

import java.util.ArrayList;
import java.util.Collections;

// D: Sort a list of squares using collections.sort();

public class Main {
    public static void main(String[] args) {

        Square squareOne = new Square(2.13, 3.5);
        Square squareTwo = new Square(4.5, 7.8);
        Square squareThree = new Square(1.0, 4.7);

        System.out.println(squareOne.compareTo(squareTwo));

        ArrayList<Square> newSquares = new ArrayList<>();

        newSquares.add(squareOne);
        newSquares.add(squareTwo);
        newSquares.add(squareThree);

        Collections.sort(newSquares);

        for (Square square : newSquares) {
            System.out.println("Perimeter: " + square.getPerimeter());
        }


    }
}

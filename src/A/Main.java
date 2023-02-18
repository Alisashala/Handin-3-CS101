package A;

import java.util.Random;

// A:  Write a method that returns a random number between 1-10.
// A:  Call the method 10 times by using a loop

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int randomNumber = getRandomNumber();
            System.out.println(randomNumber);
        }

    }

    public static int getRandomNumber() {
        Random random = new Random();
        int x = random.nextInt(10) + 1;
        return x;
    }
}


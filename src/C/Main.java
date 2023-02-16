package C;

import java.util.ArrayList;

// C: Create 5 articles, add them into an ArrayList and print them by overriding the .toString() method
public class Main {
    public static void main(String[] args) {

        ArrayList<Article> newArticles = new ArrayList<>();

        newArticles.add(new Article("Julie Petersen", "Sygeplejersken"));
        newArticles.add(new Article("Jakob Christiansen", "Bilen flyver"));
        newArticles.add(new Article("Alisa Hejazi", "Oplevelsen i bussen"));
        newArticles.add(new Article("Nadine Shala", "Rygning dræber"));
        newArticles.add(new Article("Azra Bagaeva", "Sangen hittede"));
        System.out.println(newArticles);

    }
}

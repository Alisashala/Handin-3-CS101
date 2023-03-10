package C;

public class Article {
    private String author;
    private String title;

    public Article (String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor () {
        return this.author;
    }

    public String getTitle () {
        return this.title;
    }
    @Override
    public String toString() {
        return "Articles {" +
                "Author ='" + author + '\'' +
                ", Title =" + title +
                '}';
    }
}

package E;

import java.time.LocalDate;
import java.util.Date;

public class RedditPost {
    private Date date;
    private String author;
    private int upvotes;
    private int downvotes;
    private String title;

    public RedditPost (String author, String title) {
        this.date = new Date();
        this.author = author;
        this.upvotes = 1;
        this.downvotes = 1;
        this.title = title;
    }

    //Getters:
    public Date getDate() {
        return this.date;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getUpvotes() {
        return this.upvotes;
    }

    public int getDownvotes() {
        return this.downvotes;
    }

    public String getTitle() {
        return this.title;
    }

    //Setters:
    public void setDate (Date date) {
        this.date = date;
    }

    public void setAuthor (String author){
        this.author = author;
    }
    public void setUpvotes (int upvotes) {
        this.upvotes = upvotes;
    }

    public void setDownvotes (int downvotes) {
        this.downvotes = downvotes;
    }

    public void setTitle (String title) {
        this.title = title;
    }


}

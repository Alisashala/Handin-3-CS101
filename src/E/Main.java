package E;

//E: When a new instance of RedditPost is instantiated: The current date will be generated & The balance of upvotes and downvotes starts at 1.

public class Main {
    public static void main(String[] args) {

        RedditPost post = new RedditPost("Hannah Lee", "Hello yall");
        System.out.println(post.getDate());
        System.out.println(post.getDownvotes());
        System.out.println(post.getUpvotes());


    }
}

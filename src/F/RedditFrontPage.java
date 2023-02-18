package F;

import E.RedditPost;

import java.util.ArrayList;

//Write a class: RedditFrontPage
//The RedditFrontPage has: An ArrayList of all RedditPosts

public class RedditFrontPage {
    private ArrayList<RedditPost> posts;

    public RedditFrontPage () {
        this.posts = new ArrayList<>();
    }
    public void addPost(RedditPost post) {
        this.posts.add(post);
    }
    public ArrayList<RedditPost> getPosts() {
        return this.posts;
    }
}

package F;

import E.RedditPost;

import java.util.ArrayList;

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

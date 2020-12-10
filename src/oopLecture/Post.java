package oopLecture;

import java.util.Date;

public class Post {

    private long id;
    private String authorName;
    private int numberOfViews;
    private String content;
    private String title;
    private Date datePublished;

    public Post(long id, String authorName, int numberOfViews, String content, String title, Date datePublished) {
        this.id = id;
        this.authorName = authorName;
        this.numberOfViews = numberOfViews;
        this.content = content;
        this.title = title;
        this.datePublished = datePublished;
    }

    public Post(String authorName, int numberOfViews, String content, String title, Date datePublished) {
        this.authorName = authorName;
        this.numberOfViews = numberOfViews;
        this.content = content;
        this.title = title;
        this.datePublished = datePublished;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getNumberOfViews() {
        return numberOfViews;
    }

    public void setNumberOfViews(int numberOfViews) {
        this.numberOfViews = numberOfViews;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(Date datePublished) {
        this.datePublished = datePublished;
    }
}

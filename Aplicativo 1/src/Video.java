public class Video {
    private String title;
    private String url;
    private int length;
    private User author;

    public Video(String title, String url, int length, User author) {
        this.title = title;
        this.url = url;
        this.length = length;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public int getLength() {
        return length;
    }

    public User getAuthor() {
        return author;
    }

    public void showInfo() {
        System.out.println("Title: " + title);
        System.out.println("URL: " + url);
        System.out.println("Length: " + length);
        System.out.println("Author: " + author.getName());
    }
}

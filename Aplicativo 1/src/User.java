public class User {
    protected String name;
    protected String email;
    protected String password;
    protected boolean isAdmin;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.isAdmin = false;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAdmin() {
        this.isAdmin = true;
    }

    public void watchVideo(Video video) {
        System.out.println("Watching video: " + video.getTitle());
        System.out.println("Video watched. Length: " + video.getLength());
    }

    public static String getRandomAlphaString(int length) {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < length; i++) {
            //   ascii 60 to 90
            char str = (char) (65 + (int) (Math.random() * (90 - 65)));
            b.append(str);
        }

        return b.toString();
    }

    public static int getRandomInt() {
        return getRandomInt(1, 9999);
    }

    public static int getRandomInt(int min, int max) {
        return min + (int) ((Math.random() * (max - min)));
    }

    public void uploadVideo(String title, int length) {
        User author = this;
        String url = "http://" + getRandomAlphaString(3) + "."
                + getRandomAlphaString(10) + ".com/"
                + getRandomAlphaString(getRandomInt(3, 10));
        Video video = new Video(title, url, length, author);
        System.out.println("Video uploaded: " + title);
        System.out.println("URL: " + url);
    }
}

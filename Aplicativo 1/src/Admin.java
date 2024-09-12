public class Admin extends User {
    public Admin(String name, String email, String password) {
        super(name, email, password);
    }

    public void removeVideo(Video video) {
        System.out.println("Video removed: " + video.getTitle());
    }

    public void removeUser(User user) {
        System.out.println("User removed: " + user.getName());
    }

    public void setAdmin(User user) {
        user.setAdmin();
    }
}

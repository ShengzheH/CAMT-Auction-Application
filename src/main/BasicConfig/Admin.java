package BasicConfig;

public class Admin extends User{
    User user;

    public Admin(String name, String password, String address, String notel, User user) {
        super(name, password, address, notel);
        this.user = user;
    }

    public Admin(int id, String name, String password, String address, String notel, User user) {
        super(id, name, password, address, notel);
        this.user = user;
    }

    public Admin(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
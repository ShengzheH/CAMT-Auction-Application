import java.util.List;
//User info
public class User {
    Long id;
    String name;
    String password;
    String address;
    String Notel;
    List<Item> PostItem;

    public User(Long id, String name, String password, String address, String notel) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.address = address;
        Notel = notel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNotel() {
        return Notel;
    }

    public void setNotel(String notel) {
        Notel = notel;
    }

    public List<Item> getPostItem() {
        return PostItem;
    }

    public void setPostItem(List<Item> postItem) {
        PostItem = postItem;
    }
}

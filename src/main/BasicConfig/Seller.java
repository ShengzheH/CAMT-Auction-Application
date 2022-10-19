package BasicConfig;

import BasicConfig.*;
import java.util.List;

public class Seller extends User {
    User user;
    List<Auction> postitem;  //发布的拍卖品

    public Seller(User user) {
        this.user = user;
    }

    public Seller(String name, String password, String address, String notel) {
        super(name, password, address, notel);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Auction> getPostitem() {
        return postitem;
    }

    public void setPostitem(List<Auction> postitem) {
        this.postitem = postitem;
    }


}

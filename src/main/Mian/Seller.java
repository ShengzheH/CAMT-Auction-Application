package Mian;

import Mian.Auction;

import java.util.List;

public class Seller extends User {
    User user;
    List<Auction> postitem;  //发布的拍卖品

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

    public Seller(String name, String password, String address, String notel) {
        super(name, password, address, notel);
    }

    public Seller(Long id, String name, String password, String address, String notel) {
        super(id, name, password, address, notel);
    }
}

import java.util.List;

public class Buyer extends User{
    User user;
     List<Auction> BoughtAuction;  //买到的拍卖品

    public Buyer(String name, String password, String address, String notel, User user, List<Auction> boughtAuction) {
        super(name, password, address, notel);
        this.user = user;
        BoughtAuction = boughtAuction;
    }

    public Buyer(Long id, String name, String password, String address, String notel, User user, List<Auction> boughtAuction) {
        super(id, name, password, address, notel);
        this.user = user;
        BoughtAuction = boughtAuction;
    }

    public Buyer(String name, String password, String address, String notel) {
        super(name, password, address, notel);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Auction> getBoughtAuction() {
        return BoughtAuction;
    }

    public void setBoughtAuction(List<Auction> boughtAuction) {
        BoughtAuction = boughtAuction;
    }
}

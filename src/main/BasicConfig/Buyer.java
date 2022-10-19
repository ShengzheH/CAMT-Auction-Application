package BasicConfig;

import BasicConfig.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import StrategyPattern.AuctionStrategy;

import java.util.List;

public class Buyer extends User {
    User user;
    List<Bid> OfferBid;
     List<Auction> BoughtAuction;  //买到的拍卖品

    public List<Bid> getOfferBid() {
        return OfferBid;
    }

    public void setOfferBid(List<Bid> offerBid) {
        OfferBid = offerBid;
    }

    public AuctionStrategy getAuctionStrategy() {
        return auctionStrategy;
    }

    public Buyer(User user) {
        this.user = user;
    }
    private AuctionStrategy auctionStrategy;
    public void setAuctionStrategy(AuctionStrategy auctionStrategy){
        this.auctionStrategy=auctionStrategy;
    }
    public double bid(){
        return auctionStrategy.bid();
    }

    public Buyer(String name, String password, String address, String notel, User user, List<Auction> boughtAuction) {
        super(name, password, address, notel);
        this.user = user;
        BoughtAuction = boughtAuction;
    }

    public Buyer(int id, String name, String password, String address, String notel, User user, List<Auction> boughtAuction) {
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
    public Bid Offer(int auction_id,Double price){
        Date date = new Date(System.currentTimeMillis());
        return new Bid(auction_id,this.user.id, price,date);
    }
    public List<Auction> getAllAcutions(){
        List<Auction> auctions =new ArrayList<>();
        return auctions;
    }
}

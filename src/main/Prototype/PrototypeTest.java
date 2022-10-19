package Prototype;

import BasicConfig.Seller;
import BasicConfig.User;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException{
        User u1 = new User("HHL","123456","Hailaiheguang","136666");u1.setId(1);
        User u2 = new User("WZX","123456","shangmeiyaju","136666");u2.setId(2);
        List<Seller> sellers = new ArrayList<>();
        Seller seller1 = new Seller(u1);
        Buyer buyer1 = new Buyer(u2);
        sellers.add(seller1);
        List<Buyer> buyers = new ArrayList<>();
        buyers.add(buyer1);
        List<Bid> bids = new ArrayList<>();
        //init a Auction info
        Auction a1 = new Auction("pen","p1","It's good",20.0,new Date(System.currentTimeMillis()),u1.getId());a1.setId(1);
        a1.setEnding_date(setTime());

        List<Auction> auctions = new ArrayList<>();
        buyer1.getAllAcutions();
        Bid bid1 = new Bid(1,2,10.0);
        Bid bid2 = (Bid) bid1.clone();
        bid2.SetBidValue(20.0);
        bids.add(bid1);
        bids.add(bid2);

        buyer1.setOfferBid(bids);
        a1.AddBid(bid1);
        a1.AddBid(bid2);
        do {
        } while (a1.Ending_date.compareTo(new Date(System.currentTimeMillis()))>0);
        System.out.println("Final price:"+ a1.Current_price);
        System.out.println("Final buyer_id:"+ a1.Current_buyer_id);

        auctions.add(a1);
        System.out.println("Who is the Seller of the Auction1?"+"\n");
        System.out.println("Seller Name: "+ShowSeller(sellers,a1.getSeller_id()).getUser().getName());
        System.out.println("Who Bought the Auction1? And How much he(she) offer?"+"\n");
        System.out.println("Buyer Name: "+ShowWinner(buyers,a1.getCurrent_buyer_id()).getUser().getName());
        System.out.println("Price: "+a1.getCurrent_price());
    }
    public static Date setTime(){
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(new Date(System.currentTimeMillis()));
        rightNow.add(Calendar.SECOND,5);
        return rightNow.getTime();
    }
    public static Seller ShowSeller(List<Seller> sellers,int id){
        for (int i=0;i<sellers.size();i++){
            if (id == sellers.get(i).getUser().getId()){
                return sellers.get(i);
            }
        }
        System.out.println("Sorry,Not found");
        return null;
    }
    public static Buyer ShowWinner(List<Buyer> buyers, int id){
        for (int i=0;i<buyers.size();i++){
            if (id == buyers.get(i).getUser().getId()){
                return buyers.get(i);
            }
        }
        System.out.println("Sorry,Not found");
        return null;
    }
}

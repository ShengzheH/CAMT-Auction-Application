import jdk.nashorn.internal.parser.JSONParser;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class App {
    public static void main(String[] args) throws InterruptedException {
        User u1 = new User("HHL","123456","Hailaiheguang","136666");u1.setId(1);
        User u2 = new User("WZX","123456","shangmeiyaju","136666");u2.setId(2);
        User u3 = new User("HSZ","123456","Hailaiheguang","136666");u3.setId(3);
        User u4 = new User("YCC","123456","Hailaiheguang","136666");u4.setId(4);
        Seller seller1 = new Seller(u1);
        Buyer buyer1 = new Buyer(u2);
        Buyer buyer2 = new Buyer(u3);
        Buyer buyer3 = new Buyer(u4);
        Auction a1 = new Auction("pen","p1","It's good",20.0,new Date(System.currentTimeMillis()),u1.getId());a1.setId(1);
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(new Date(System.currentTimeMillis()));
        rightNow.add(Calendar.SECOND,10);
        a1.setEnding_date(rightNow.getTime());
        List<Auction> auctions = new ArrayList<>();
        auctions.add(a1);
        seller1.setPostitem(auctions);
        buyer1.getAllAcutions();     //buyer can scan all of the acutions from the application;  And select one to offer; if the Acution id is 1
        Bid bid1 = buyer1.Offer(1,30.0); bid1.setId(1);  // if buyer offer once  the bid will create once
        a1.AddBid(bid1);
        Thread.sleep(1000);

        buyer2.getAllAcutions();
        Bid bid2 = buyer2.Offer(1,40.0);bid2.setId(2);   // buyer2 also want to offer the auction1
        a1.AddBid(bid2);
        Thread.sleep(1000);

        buyer3.getAllAcutions();                             //buyer3 also want to offer the auction1 and the price is same as buyer2
        Bid bid3 = buyer3.Offer(1,40.0);bid3.setId(3);
        a1.AddBid(bid3);
        a1.setEnding_date(new Date(System.currentTimeMillis()));
        do {

        } while (a1.Ending_date.compareTo(new Date(System.currentTimeMillis()))>0);
        System.out.println("Final price:"+ a1.Current_price);
        System.out.println("Final buyer_id:"+ a1.Current_buyer_id);
    }
}

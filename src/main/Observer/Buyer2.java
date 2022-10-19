package Observer;

import BasicConfig.Buyer;
import BasicConfig.User;

import java.util.Date;

/**
 * @date 2022/10/20 - 0:08
 */
public class Buyer2 implements ObserverBid{
    User user2 = new User(2, "Shengzhe Huang", "123456", "Yinchuan", "1XXX");
    Buyer buyer2 = new Buyer(user2);
    Date date = new Date(System.currentTimeMillis());

    public void update () {
        System.out.println(user2.getName() + " participates in auction, please generate a Bid.");
        System.out.println("This is the new Bid:");
        System.out.println("Buyer's ID:" + user2.getId() + ". Offer: 80.00. Date:" + date + ".");

    }
}

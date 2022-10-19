package Observer;

import BasicConfig.Buyer;
import BasicConfig.User;

import java.util.Date;

/**
 * @date 2022/10/20 - 0:04
 */
public class Buyer1 implements ObserverBid{
        User user1 = new User(1, "Haolong Huai", "123456", "NingXia", "0XXX");
        Buyer buyer1 = new Buyer(user1);
        Date date = new Date(System.currentTimeMillis());

    public void update () {
        System.out.println(user1.getName() + " participates in auction, please generate a Bid.");
        System.out.println("This is the new Bid:");
        System.out.println("Buyer's ID:" + user1.getId() + ". Offer: 50.00. Date:" + date + ".");

    }
}

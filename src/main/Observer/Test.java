package Observer;

import BasicConfig.Buyer;
import BasicConfig.User;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        //创建两个任务
        //Create two buyers
        Buyer1 buyer1 = new Buyer1();
        Buyer2 buyer2 = new Buyer2();

        //创建主题角色,并添加两个观察者
        //Create a theme role and add two observers
        ConcreteSubjectAuction sub = new ConcreteSubjectAuction();
        sub.attach(buyer1);
        sub.attach(buyer2);

        //Delete buyer2
        //sub.detach(buyer2);
       //System.out.println("Buyer2 withdrew from the auction.");

        //进行更新通知
        //Update notification
        sub.notify1();
        }
    }

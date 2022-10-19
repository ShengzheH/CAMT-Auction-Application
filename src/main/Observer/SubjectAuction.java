package Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class SubjectAuction {
    //Define an observer collection to store all observer objects
    //定义一个观察者集合用于存储所有观察者对象
    public List<ObserverBid> observers = new ArrayList<ObserverBid>();

    //Registration method, used to add an observer to the observer collection
    //注册方法，用于向观察者集合中增加一个观察者
    public void attach(ObserverBid observer) {
        observers.add(observer);
    }

    //Logoff method, used to delete an observer in the observer collection
    //注销方法，用于在观察者集合中删除一个观察者
    public void detach(ObserverBid observer) {
        observers.remove(observer);
    }

    //Declare abstract notification methods
    //声明抽象通知方法
     public abstract void notify1();


};



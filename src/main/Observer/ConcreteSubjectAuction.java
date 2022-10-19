package Observer;

public class ConcreteSubjectAuction extends SubjectAuction {
    //Implement notification method
    // 实现通知方法
    @Override
    public void notify1() {
        System.out.println("Auction begins!");
        //Start notifying all observers
        // 开始通知所有观察者
        for (ObserverBid observer : observers) {
            observer.update();
        }
    }
}

package Observer;

public class ConcreteObserverBid implements ObserverBid{
    //Implementation response method
    // 实现响应方法
    @Override
    public void update() {
        //具体响应代码
        System.out.println("Status updated");//状态已更新
    }
}

import SingleTonPattern.Buyer;

public class Client {
    public static void main(String[] args) {
        Buyer instance = Buyer.getInstance();
        Buyer instance1 = Buyer.getInstance();
        //判断获取到的两个是否是同一个对象
        System.out.println(instance == instance1);
    }
}
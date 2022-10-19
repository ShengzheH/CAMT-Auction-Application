package SingleTonPattern;

public class Buyer {
    //1. Private construction method
        private Singleton(){}
    //2. Create objects of this class in this class
        private static Singleton instance =new Singleton();
    //3. Provide a public access method to let the outside world obtain the object
        public static Singleton getInstance(){
            return instance;
        }
    }

    public class Client {
        public static void main(String[] args) {
            Singleton instance = Singleton.getInstance();
            Singleton instance1=Singleton.getInstance();
            //判断获取到的两个是否是同一个对象
            System.out.println(instance==instance1);
        }
    }

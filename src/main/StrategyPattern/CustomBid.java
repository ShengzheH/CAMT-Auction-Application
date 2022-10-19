package StrategyPattern;

/**
 * @author jmm
 * @version 1.0
 * @date 2022/10/19 14:59
 * @email 2867405686@qq.com
 */
public class CustomBid implements AuctionStrategy{
    @Override
    public double bid() {
        return 1;
    }

    public double bid(double price) {
        return 0;
    }
}

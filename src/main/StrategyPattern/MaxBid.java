package StrategyPattern;

/**
 * @author jmm
 * @version 1.0
 * @date 2022/10/19 14:47
 * @email 2867405686@qq.com
 */
public class MaxBid implements AuctionStrategy{
    @Override
    public double bid() {
        return 10000;
    }
}

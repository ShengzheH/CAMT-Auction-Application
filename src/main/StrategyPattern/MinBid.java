package StrategyPattern;


import BasicConfig.Auction;

/**
 * @author jmm
 * @version 1.0
 * @date 2022/10/19 14:54
 * @email 2867405686@qq.com
 */
public class MinBid implements AuctionStrategy{
    @Override
    public double bid() {
        return new Auction().getStart_Price();
    }
}

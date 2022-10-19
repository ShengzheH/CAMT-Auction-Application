package StrategyPattern;

import Mian.Auction;

/**
 * @author jmm
 * @version 1.0
 * @date 2022/10/19 14:48
 * @email 2867405686@qq.com
 */
public class DoubleBid implements AuctionStrategy {
    @Override
    public double bid() {
        return new Auction().getCurrent_price()*2;
    }
}

package BuilderPattern;

import BasicConfig.Auction;

public abstract class AuctionBuilder {
    protected Auction auction=new Auction();

    public abstract void buildId();
    public abstract void buildName();
    public abstract void buildPhoto();
    public abstract void buildDescription();
    public abstract void buildStart_Price();
    public abstract void buildEnding_date();
    public abstract void buildCurrent_buyer_id();
    public abstract void buildCurrent_price();
    public abstract void buildSeller_id();
    public abstract void buildBuyer_id();
    public abstract void buildBids();
    public Auction getAuction(){
        return auction;
    }
}

package BuilderPattern;

import BasicConfig.Auction;

public class Director {
    private AuctionBuilder cBuilder;
    public Director(AuctionBuilder cBuilder){
        this.cBuilder=cBuilder;
    }
    public Auction construct(){
        cBuilder.buildId();
        cBuilder.buildName();
        cBuilder.buildDescription();
        cBuilder.buildPhoto();
        cBuilder.buildStart_Price();
        cBuilder.buildEnding_date();
        cBuilder.buildCurrent_buyer_id();
        cBuilder.buildCurrent_price();
        cBuilder.buildSeller_id();
        cBuilder.buildBuyer_id();
        cBuilder.buildBids();
        return cBuilder.getAuction();
    }
}

package BuilderPattern;

public class D90 extends AuctionBuilder{
    @Override
    public void buildId() {
        auction.setId(2);
    }

    @Override
    public void buildName() {
        auction.setName("Canon EOS 90d");
    }

    @Override
    public void buildPhoto() {

    }

    @Override
    public void buildDescription() {auction.setDescription("I have bought a new Nikon camera and sold this Canon EOS m50.\n" +
            "It was purchased in 2019, but the body was not bumped, and the lens had slight scratches. Camera+lens+camera bag+cleaning tool+two batteries+charger, including mail.");
    }

    @Override
    public void buildStart_Price() {
        auction.setStart_Price(1599.0);
    }

    @Override
    public void buildEnding_date() {

    }

    @Override
    public void buildCurrent_buyer_id() {
        auction.setCurrent_user(64);
    }

    @Override
    public void buildCurrent_price() {
        auction.setCurrent_price(2399.0);
    }

    @Override
    public void buildSeller_id() {
        auction.setSeller_id(29);
    }

    @Override
    public void buildBuyer_id() {
        auction.setBuyer_id(14);
    }

    @Override
    public void buildBids() {

    }
}

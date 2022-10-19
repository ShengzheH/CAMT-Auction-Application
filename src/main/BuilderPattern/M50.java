package BuilderPattern;

public class M50 extends AuctionBuilder{
    @Override
    public void buildId() {
        auction.setId(1);
    }

    @Override
    public void buildName() {
         auction.setName("Canon EOS m50");
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
        auction.setStart_Price(699.0);
    }

    @Override
    public void buildEnding_date() {

    }

    @Override
    public void buildCurrent_buyer_id() {
       auction.setCurrent_user(12);
    }

    @Override
    public void buildCurrent_price() {
       auction.setCurrent_price(718.0);
    }

    @Override
    public void buildSeller_id() {
          auction.setSeller_id(23);
    }

    @Override
    public void buildBuyer_id() {
       auction.setBuyer_id(24);
    }

    @Override
    public void buildBids() {

    }


}

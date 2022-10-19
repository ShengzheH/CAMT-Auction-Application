import java.util.Date;

/* 拍卖记录
*/
public class Bid {
    int id;
    int Auction_id;
    int buyer_id;
    Double offer;   //出价价格
    Date offer_date;  //出价日期

    public Bid(int auction_id, int buyer_id, Double offer, Date offer_date) {
        Auction_id = auction_id;
        this.buyer_id = buyer_id;
        this.offer = offer;
        this.offer_date = offer_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAuction_id() {
        return Auction_id;
    }

    public void setAuction_id(int auction_id) {
        Auction_id = auction_id;
    }

    public int getBuyer_id() {
        return buyer_id;
    }

    public void setBuyer_id(int buyer_id) {
        this.buyer_id = buyer_id;
    }

    public Double getOffer() {
        return offer;
    }

    public void setOffer(Double offer) {
        this.offer = offer;
    }

    public Date getOffer_date() {
        return offer_date;
    }

    public void setOffer_date(Date offer_date) {
        this.offer_date = offer_date;
    }
}

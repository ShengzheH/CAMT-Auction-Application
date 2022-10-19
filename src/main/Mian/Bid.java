package Mian;

/* 拍卖记录
*/
public class Bid {

    Long id;
    Long Auction_id;
    Long buyer_id;
    Double offer;   //出价价格
    String offer_date;  //出价日期

    public Bid(Long auction_id, Long buyer_id, Double offer, String offer_date) {
        Auction_id = auction_id;
        this.buyer_id = buyer_id;
        this.offer = offer;
        this.offer_date = offer_date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAuction_id() {
        return Auction_id;
    }

    public void setAuction_id(Long auction_id) {
        Auction_id = auction_id;
    }

    public Long getBuyer_id() {
        return buyer_id;
    }

    public void setBuyer_id(Long buyer_id) {
        this.buyer_id = buyer_id;
    }

    public Double getOffer() {
        return offer;
    }

    public void setOffer(Double offer) {
        this.offer = offer;
    }

    public String getOffer_date() {
        return offer_date;
    }

    public void setOffer_date(String offer_date) {
        this.offer_date = offer_date;
    }
}

package Prototype;

import java.util.Date;

public class Bid implements Cloneable{
    int id;
    int Auction_id;
    int buyer_id;
    Double offer;   //出价价格
    Date offer_date;  //出价日期

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString() {
        return "Bid{" +
                "id=" + id +
                ", Auction_id=" + Auction_id +
                ", buyer_id=" + buyer_id +
                ", offer=" + offer +
                ", offer_date=" + offer_date +
                '}';
    }

    public Bid(int auction_id, int buyer_id, Double offer) {
        Auction_id = auction_id;
        this.buyer_id = buyer_id;
        this.offer = offer;
        this.offer_date = new Date(System.currentTimeMillis());
    }
    public void SetBidValue(Double offer){
        this.offer = offer;
        this.offer_date = new Date(System.currentTimeMillis());
    }

    public Bid(){};

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

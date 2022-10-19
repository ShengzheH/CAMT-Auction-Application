package BasicConfig;

import BasicConfig.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
// 拍卖品
public class Auction {
    int id;
    String name;
    String photo;
    String description;
    Double Start_Price;
    Date Ending_date;  //结束时间
    int Current_buyer_id;   // 当前出价最高的用户
    Double Current_price;   //当前出价最高的价格
    int seller_id;  //出售者id
    int buyer_id;    //购买者id
    List<Bid> bids = new ArrayList<>();   //出价记录

    public Auction(String name, String photo, String description, Double start_Price, Date ending_date,int seller_id) {
        this.name = name;
        this.photo = photo;
        this.description = description;
        this.Start_Price = start_Price;
        this.Ending_date = ending_date;
        this.seller_id = seller_id;
    }
    public Auction(){

    }
    public Auction(String name,String photo,String description,Double start_Price,Date ending_date) {
        this.name = name;
        this.photo = photo;
        this.description = description;
        this.Start_Price = start_Price;
        this.Ending_date = ending_date;
        this.seller_id = seller_id;
    }
    public void FinalOffer(int buyer_id,double current_price){
        if (this.Current_price == null){
            this.Current_price = current_price;
            this.Current_buyer_id = buyer_id;
        }
        else if(this.Current_price<current_price){
            this.Current_price = current_price;
            this.Current_buyer_id = buyer_id;
        }
    }
    public void AddBid(Bid bid){

        this.bids.add(bid);
        if (this.Ending_date.compareTo(bid.getOffer_date())<0){
            return;
        }
        FinalOffer(bid.buyer_id,bid.getOffer());
    }

    public void setCurrent_buyer_id(int current_buyer_id) {
        Current_buyer_id = current_buyer_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getStart_Price() {
        return Start_Price;
    }

    public void setStart_Price(Double start_Price) {
        Start_Price = start_Price;
    }

    public Date getEnding_date() {
        return Ending_date;
    }

    public void setEnding_date(Date ending_date) {
        Ending_date = ending_date;
    }

    public int getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(int seller_id) {
        this.seller_id = seller_id;
    }

    public int getBuyer_id() {
        return buyer_id;
    }

    public void setBuyer_id(int buyer_id) {
        this.buyer_id = buyer_id;
    }

    public List<Bid> getBids() {
        return bids;
    }

    public void setBids(List<Bid> bids) {
        this.bids = bids;
    }




    public int getCurrent_buyer_id() {
        return Current_buyer_id;
    }

    public void setCurrent_user(int current_buyer_id) {
        Current_buyer_id = current_buyer_id;
    }

    public Double getCurrent_price() {
        return Current_price;
    }

    public void setCurrent_price(Double current_price) {
        Current_price = current_price;
    }
}

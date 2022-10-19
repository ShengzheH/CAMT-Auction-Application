import java.util.List;
// 拍卖品
public class Auction {
    Long id;
    String name;
    String photo;
    String description;
    Double Start_Price;
    String Ending_date;  //结束时间
    User Current_user;   // 当前出价最高的用户
    Double Current_price;   //当前出价最高的价格
    Long seller_id;  //出售者id
    Long buyer_id;    //购买者id
    List<Bid> bids;   //出价记录

    public Auction(String name, String photo, String description, Double start_Price, String ending_date) {
        this.name = name;
        this.photo = photo;
        this.description = description;
        Start_Price = start_Price;
        Ending_date = ending_date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getEnding_date() {
        return Ending_date;
    }

    public void setEnding_date(String ending_date) {
        Ending_date = ending_date;
    }

    public Long getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(Long seller_id) {
        this.seller_id = seller_id;
    }

    public Long getBuyer_id() {
        return buyer_id;
    }

    public void setBuyer_id(Long buyer_id) {
        this.buyer_id = buyer_id;
    }

    public List<Bid> getBids() {
        return bids;
    }

    public void setBids(List<Bid> bids) {
        this.bids = bids;
    }




    public User getCurrent_user() {
        return Current_user;
    }

    public void setCurrent_user(User current_user) {
        Current_user = current_user;
    }

    public Double getCurrent_price() {
        return Current_price;
    }

    public void setCurrent_price(Double current_price) {
        Current_price = current_price;
    }
}

import java.util.Date;
//Item detail info
public class Item {
    Long id;
    String name;
    String photo;
    String description;
    Double Start_Price;
    Date Ending_date;

    public Item(Long id, String name, String photo, String description, Double start_Price, Date ending_date) {
        this.id = id;
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

    public Date getEnding_date() {
        return Ending_date;
    }

    public void setEnding_date(Date ending_date) {
        Ending_date = ending_date;
    }
}

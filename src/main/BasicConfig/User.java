package BasicConfig;

import BasicConfig.*;
import StrategyPattern.AuctionStrategy;

import java.util.List;
//Mian.User info
public class User {
    int id;
    String name;
    String password;
    String address;
    String Notel;
    public User(){}

    public User(String name, String password, String address, String notel) {
        this.name = name;
        this.password = password;
        this.address = address;
        Notel = notel;
    }

    public User(int id, String name, String password, String address, String notel) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.address = address;
        Notel = notel;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNotel() {
        return Notel;
    }

    public void setNotel(String notel) {
        Notel = notel;
    }


}

package pl.akademiakodu.users.model;



public class User {


    private String username;
    private String brand;
    private String type;
    private int price;

    private String email;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    //


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    //


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

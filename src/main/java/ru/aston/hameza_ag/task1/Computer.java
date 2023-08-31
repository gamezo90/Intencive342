package ru.aston.hameza_ag.task1;

import java.math.BigDecimal;

public abstract class Computer implements Discount {

    private Manufacturer manufacturer;
    private String model;
    private BigDecimal price;
    private User user;



    public Computer(Manufacturer manufacturer, String model, BigDecimal price , User user){
        this.setManufacturer(manufacturer);
        this.setModel(model);
        this.setPrice(price);
        this.setUser(user);
    }

    public abstract BigDecimal getDiscount();

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public User getUser() { return user; }

    public void setManufacturer(Manufacturer manufacturer){
        this.manufacturer = manufacturer;}

    public void setModel(String model) {
        this.model = model ;
    }

    public BigDecimal setPrice(BigDecimal price) {
        this.price = price;
        return price;
    }

    public void setUser(User user){this.user = user;}

    public String toString() {
       return "Computer{" +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price + '\'' + ", userName='" + user.getName() + ", sourName='"+ user.getSourName();
    }

}

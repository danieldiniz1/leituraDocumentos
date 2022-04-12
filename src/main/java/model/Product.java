package model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Product implements Serializable {

    private String name;
    private BigDecimal price;
    private Integer quantity;

    public Product() {
    }

    public Product(String name, BigDecimal price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product [" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                "]";
    }
}

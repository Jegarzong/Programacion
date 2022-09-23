/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oscarblancarte.ipd.factorymethod.entity;


/**
 *
 * @author juang
 */
public class Product {
 private Long idProduct;
 private String productName;
 private double price;

 public Product(Long idProduct, String productName, double price) {
 this.idProduct = idProduct;
 this.productName = productName;
 this.price = price;
 }

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}

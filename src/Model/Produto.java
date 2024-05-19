package Model;

import java.sql.Timestamp;

public class Produto {

    //atributos
    private int product_id;
    private String name;
    private String description;
    private int stock;
    private double price;
    private Timestamp date_registered;
    
    //construtor vazio
    public Produto(){
        
    }
    
    //construtor com dados
    public Produto(int product_id, String name, String description, int stock,
            double price, Timestamp date_registered) {
        
        setProduct_id(product_id);
        setName(name);
        setDescription(description);
        setStock(stock);
        setPrice(price);
        setDate_registered(date_registered);
    }
    
    //getters e setters
    public int getProduct_id() {return product_id;}
    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getName() {return name;}
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {return description;}
    public void setDescription(String description) {
        this.description = description;
    }
    
    public int getStock() {return stock;}
    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {return price;}
    public void setPrice(double price) {
        this.price = price;
    }

    public Timestamp getDate_registered() {return date_registered;}
    public void setDate_registered(Timestamp date_registered) {
        this.date_registered = date_registered;
    }
    
    
    
}
   
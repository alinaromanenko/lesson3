package lesson3;

public class Product {
    private long id;
    private String name;
    private int quantity;
    private String description;

    Product (long id, String name, int quantity, String description){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }
    public void productInfo(){
        System.out.println("ID: "+id+"\nName: "+name+"\nQuantity: "+quantity+"\nDescription: "+description);
    }
}

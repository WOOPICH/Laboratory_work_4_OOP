package woopich.inteface;

public class Cloth implements Priceable{
    private String name;
    private double price;

    public Cloth(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void getPrice() { //Equals toString()
        System.out.println("This " + name + " costs: " + price + "$");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

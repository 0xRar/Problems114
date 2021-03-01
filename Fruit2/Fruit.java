public class Fruit {
    private String Name;
    private String Country;
    private double Price;
    private int Quantity;

    public Fruit(String Name, String Country, double Price, int Quantity) {
        this.Name = Name;
        this.Country = Country;
        this.Price = Price;
        this.Quantity = Quantity;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getName() {
        return Name;
    }

    public String getCountry() {
        return Country;
    }

    public double getPrice() {
        return Price;
    }

    public int getQuantity() {
        return Quantity;
    }
}

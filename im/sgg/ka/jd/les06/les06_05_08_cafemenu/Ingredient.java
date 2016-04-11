package im.sgg.ka.jd.les06.les06_05_08_cafemenu;

public class Ingredient {
    private String name;
    private double pricePerGram;
    private int weight;
    private double price;

    public Ingredient() {
        this(null,0);
    }

    public Ingredient(String name, double pricePerGram) {
        this(name,pricePerGram,0);
    }

    public Ingredient(String name, double pricePerGram, int weight) {
        this.name = name;
        this.pricePerGram = pricePerGram;
        this.weight = weight;
        this.price = this.countPrice();
    }

///////////////////////////////////////////////////////

    public void setIngredient(String name, double pricePerGram) {
        setIngredient(name,pricePerGram,0);

    }
    public void setIngredient(String name, double pricePerGram, int weight) {
        this.name = name;
        this.pricePerGram = pricePerGram;
        this.weight = weight;

    }

    public double countPrice(){
        return this.getWeight()*this.getPricePerGram();
    }

///////////////////////////////////////////////////////

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPricePerGram() {
        return pricePerGram;
    }

    public void setPricePerGram(double pricePerGram) {
        this.pricePerGram = pricePerGram;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

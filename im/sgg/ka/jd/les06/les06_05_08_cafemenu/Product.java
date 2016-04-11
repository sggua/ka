package im.sgg.ka.jd.les06.les06_05_08_cafemenu;

public class Product {
    private String name;
    private Recipe recipe;
    private double price;
    private double sellPrice;

    public Product() {
        this(null);
    }

    public Product(String name) {
        this(name,null);
    }

    public Product(String name, Recipe recipe) {
        this.name = name;
        this.recipe = recipe;
        this.price = this.calcPrice();
        this.sellPrice = this.calcSellPrice();
    }

    //////////////////////////////////////////////////////

    public void printProduct(){
        System.out.println(this.getName());
        System.out.println("================================");
        System.out.println(this.getName() + "\t("+this.getWeight()+"g)"+ "\tPrice: "+this.getSellPrice()+" UAH");
        System.out.println("--------------------------------");
        for (Ingredient i:this.getRecipe().getIngredient()  ) {
            System.out.println(i.getName()+"\t"+i.getWeight()+"\t"+i.getPrice());
        }
        System.out.println("--------------------------------");
        System.out.println("Total costs:\t"+this.getPrice());
        System.out.println("================================\n");
    }



    public double calcPrice() {
        double p = 0;
        for ( Ingredient ing : this.getRecipe().getIngredient()  ) {
            p += ing.getWeight()*ing.getPricePerGram();
        }
        return p;
    }
    public double calcSellPrice() {
        return (int)(this.price*(1+Menu.MARK_UP/100)*100)/100-0.05;
    }

    public int getWeight() {
        int w = 0;
        for ( Ingredient ing : this.getRecipe().getIngredient()  ) {
            w += ing.getWeight();
        }
        return w;
    }

    //////////////////////////////////////////////////////

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }
}

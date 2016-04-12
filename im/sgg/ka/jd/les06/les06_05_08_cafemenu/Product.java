package im.sgg.ka.jd.les06.les06_05_08_cafemenu;

public class Product {
    private String name;
    private Recipe recipe;
    private double price;
    private double sellPrice;
    private double income;
    private double markUp;

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
        this.income = this.calcIncome();
        this.markUp = this.calcMarkUp(); // %  income/price * 100
    }

    //////////////////////////////////////////////////////

    public void printProduct(){
        System.out.println("\n"+this.getName());
        System.out.println("========================================");
        System.out.println(this.getName() + "\t("+this.getWeight()+"g)"+ "\tPrice: "+this.getSellPrice()+" UAH");
        System.out.println("----------------------------------------");
        for (Ingredient i:this.getRecipe().getIngredient()  ) {
            System.out.println(i.getName()+"\t"+i.getWeight()+"g  \tx "+i.getPricePerGram()+" UAH\t"+i.getPrice());
        }
        System.out.println("----------------------------------------");
        System.out.println("Costs: "+this.getPrice()+"\tIncome: "+this.getIncome()
                                            +"\tMarkUp: "+this.getMarkUp()+"%");
        System.out.println("========================================");
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

    public double calcIncome() {
        return (int)((this.getSellPrice()-this.getPrice())*100)/100.0;
    }

    public double calcMarkUp() {
        return (int)(10000*this.getIncome()/this.getPrice())/100.0;
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

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getMarkUp() {
        return markUp;
    }

    public void setMarkUp(double markUp) {
        this.markUp = markUp;
    }
}

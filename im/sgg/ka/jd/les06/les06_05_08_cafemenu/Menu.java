package im.sgg.ka.jd.les06.les06_05_08_cafemenu;


public class Menu {
    private Ingredient[] ingredient;
    private Recipe[] recipe;
    private Product[] product;
    public static final int MARK_UP = 150; // %

    public Menu() {
        this(null,null,null);
    }

    public Menu(Ingredient[] ingredient, Recipe[] recipe, Product[] product) {
        this.ingredient = ingredient;
        this.recipe = recipe;
        this.product = product;
    }

    //////////////////////////////////////////////

    public void printMenu (){
        System.out.println("CAFE MENU\n");
        for (Product p: this.getProduct()  ) {
            if (p!=null) p.printProduct();
        }
    }

    //////////////////////////////////////////////

    public Ingredient[] getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient[] ingredient) {
        this.ingredient = ingredient;
    }

    public Recipe[] getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe[] recipe) {
        this.recipe = recipe;
    }

    public Product[] getProduct() {
        return product;
    }

    public void setProduct(Product[] product) {
        this.product = product;
    }
}

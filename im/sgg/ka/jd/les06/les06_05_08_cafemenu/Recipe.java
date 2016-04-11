package im.sgg.ka.jd.les06.les06_05_08_cafemenu;

public class Recipe {

    private String name;
    private Ingredient[] ingredient;

    public Recipe() {
        this(null);
    }

    public Recipe(String name) {
        this(name,null);
    }

    public Recipe(String name, Ingredient[] ingredient) {
        this.name = name;
        this.ingredient = ingredient;
    }

/////////////////////////////////////////////////////////////

   public void setIngredientWeight(int i, int weight) {
       if (this.getIngredient()!=null && this.getIngredient()[i]!=null)
           this.getIngredient()[i].setWeight(weight);
   }

/////////////////////////////////////////////////////////////

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ingredient[] getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient[] ingredient) {
        this.ingredient = ingredient;
    }
}

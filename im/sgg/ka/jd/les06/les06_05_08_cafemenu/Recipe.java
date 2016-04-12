package im.sgg.ka.jd.les06.les06_05_08_cafemenu;

import java.util.Arrays;

public class Recipe {

    private String name;
    private Ingredient[] ingredient;

//    public Recipe() {
//        this(null);
//    }

//    public Recipe(String name) {
//        this(name,null);
//    }

    public Recipe(String name, Ingredient[] ingredient) {
        this.name = name;
        this.ingredient = copyIngredient(ingredient);
    }

/////////////////////////////////////////////////////////////

   public void setIngredientWeight(int i, int weight) {
       if (this.ingredient!=null && this.ingredient[i]!=null) {
           this.ingredient[i].setWeight(weight);
           this.ingredient[i].countPrice();
       }

   }

    private Ingredient[] copyIngredient(Ingredient[] iFrom) {
        Ingredient [] iTo = new Ingredient[iFrom.length];
        for (int i=0; i< iFrom.length;i++ ) {
            if (iFrom!=null ){
                iTo[i] = new Ingredient(iFrom[i].getName(),iFrom[i].getPricePerGram());
            }
        }
        return iTo;
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

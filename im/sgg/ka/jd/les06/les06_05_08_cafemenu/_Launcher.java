package im.sgg.ka.jd.les06.les06_05_08_cafemenu;

/**
 * Created by sergiy on 11.04.16.
 * Java Developer lessons
 * kademika.com
 */
public class _Launcher {

    public static void main(String[] args) {

        Menu menu = new Menu();

        menu.setExtra(300);

        menu.setIngredient(initIngredients());
        menu.setRecipe(initRecipes(menu));
        menu.setProduct(initProducts(menu));

        menu.printMenu();

    }

    private static Product[] initProducts(Menu menu) {
        Product[] p = new Product[menu.getRecipe().length];
        for (int i=0; i<menu.getRecipe().length ; i++){
            if (menu.getRecipe()[i]!=null && menu.getRecipe()[i].getName()!= null) {
                p[i] = new Product(menu.getRecipe()[i].getName(), menu.getRecipe()[i], menu.getExtra());
            }
        }
        return p;
    }


    private static Recipe[] initRecipes(Menu menu){
        Recipe[] r = new Recipe[10];
        r[0] = new Recipe("Black coffee", new Ingredient[]
                {menu.getIngredient()[1],  menu.getIngredient()[2] });
        r[0].setIngredientWeight(0,55);
        r[0].setIngredientWeight(1,5);

        r[1] = new Recipe("Coffee with milk", new Ingredient[]
                {menu.getIngredient()[0], menu.getIngredient()[1],  menu.getIngredient()[2] });
        r[1].setIngredientWeight(0,55);
        r[1].setIngredientWeight(1,60);
        r[1].setIngredientWeight(2,5);

        r[2] = new Recipe("Americano", new Ingredient[]
                {menu.getIngredient()[1],  menu.getIngredient()[2] });
        r[2].setIngredientWeight(0,115);
        r[2].setIngredientWeight(1,5);

        r[3] = new Recipe("Cappuccino", new Ingredient[]
                {menu.getIngredient()[0], menu.getIngredient()[1],  menu.getIngredient()[2], menu.getIngredient()[3] });
        r[3].setIngredientWeight(0,55);
        r[3].setIngredientWeight(1,52);
        r[3].setIngredientWeight(2,5);
        r[3].setIngredientWeight(3,8);

        r[4] = new Recipe("Mocaccino", new Ingredient[]
                {menu.getIngredient()[0], menu.getIngredient()[1],  menu.getIngredient()[2]
                        , menu.getIngredient()[3], menu.getIngredient()[7] });
        r[4].setIngredientWeight(0,50);
        r[4].setIngredientWeight(1,47);
        r[4].setIngredientWeight(2,5);
        r[4].setIngredientWeight(3,8);
        r[4].setIngredientWeight(4,10);

        r[5] = new Recipe("Black tea", new Ingredient[]
                {menu.getIngredient()[1],  menu.getIngredient()[3],  menu.getIngredient()[4] });
        r[5].setIngredientWeight(0,147);
        r[5].setIngredientWeight(1,8);
        r[5].setIngredientWeight(2,5);

        r[6] = new Recipe("Green tea", new Ingredient[]
                {menu.getIngredient()[1],  menu.getIngredient()[5] });
        r[6].setIngredientWeight(0,155);
        r[6].setIngredientWeight(1,5);

        r[7] = new Recipe("Earl Gray tea", new Ingredient[]
                {menu.getIngredient()[1],  menu.getIngredient()[3],  menu.getIngredient()[6] });
        r[7].setIngredientWeight(0,147);
        r[7].setIngredientWeight(1,8);
        r[7].setIngredientWeight(2,5);

        return r;
    }

    private static Ingredient[] initIngredients(){
        Ingredient[] i = new Ingredient[10];

        i[0] = new Ingredient("milk     ", 0.02);
        i[1] = new Ingredient("water    ", 0.01);
        i[2] = new Ingredient("coffee   ", 0.40);
        i[3] = new Ingredient("sugar    ", 0.02);
        i[4] = new Ingredient("blacktea ", 0.40);
        i[5] = new Ingredient("greentea ", 0.40);
        i[6] = new Ingredient("earlgray ", 0.40);
        i[7] = new Ingredient("chocolate", 0.20);

        return i;
    }

}

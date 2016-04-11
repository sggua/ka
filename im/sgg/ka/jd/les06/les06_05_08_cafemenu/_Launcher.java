package im.sgg.ka.jd.les06.les06_05_08_cafemenu;

/**
 * Created by sergiy on 11.04.16.
 * Java Developer lessons
 * kademika.com
 */
public class _Launcher {

    public static void main(String[] args) {

        Menu menu = new Menu();

        menu.setIngredient(initIngredients());
        menu.setRecipe(initRecipes(menu));
        menu.setProduct(initProducts(menu));

        menu.printMenu();

    }

    private static Product[] initProducts(Menu menu) {
        Product[] p = new Product[menu.getRecipe().length];
        for (int i=0; i<menu.getRecipe().length ; i++){
            if (menu.getRecipe()[i]!=null && menu.getRecipe()[i].getName()!= null) {
                p[i] = new Product(menu.getRecipe()[i].getName(), menu.getRecipe()[i]);
            }
        }
        return p;
    }


    private static Recipe[] initRecipes(Menu menu){
        Recipe[] r = new Recipe[10];
        r[0] = new Recipe("Black coffee", new Ingredient[]
                {menu.getIngredient()[1],  menu.getIngredient()[2] });
        r[0].setIngredientWeight(0,60);
        r[0].setIngredientWeight(1,5);

        r[1] = new Recipe("Coffee with milk", new Ingredient[]
                {menu.getIngredient()[0], menu.getIngredient()[1],  menu.getIngredient()[2] });
        r[1].setIngredientWeight(0,60);
        r[1].setIngredientWeight(1,60);
        r[1].setIngredientWeight(2,5);

        r[2] = new Recipe("Americano", new Ingredient[]
                {menu.getIngredient()[1],  menu.getIngredient()[2] });
        r[2].setIngredientWeight(0,120);
        r[2].setIngredientWeight(1,5);

        r[3] = new Recipe("Cappuccino", new Ingredient[]
                {menu.getIngredient()[0], menu.getIngredient()[1],  menu.getIngredient()[2], menu.getIngredient()[3] });
        r[3].setIngredientWeight(0,60);
        r[3].setIngredientWeight(1,60);
        r[3].setIngredientWeight(2,5);
        r[3].setIngredientWeight(3,8);

        r[4] = new Recipe("Mocaccino", new Ingredient[]
                {menu.getIngredient()[0], menu.getIngredient()[1],  menu.getIngredient()[2]
                        , menu.getIngredient()[3], menu.getIngredient()[7] });
        r[4].setIngredientWeight(0,50);
        r[4].setIngredientWeight(1,50);
        r[4].setIngredientWeight(2,5);
        r[4].setIngredientWeight(3,8);
        r[4].setIngredientWeight(4,20);

        r[5] = new Recipe("Black tea", new Ingredient[]
                {menu.getIngredient()[1],  menu.getIngredient()[3],  menu.getIngredient()[4] });
        r[5].setIngredientWeight(0,150);
        r[5].setIngredientWeight(1,8);
        r[5].setIngredientWeight(2,5);

        r[6] = new Recipe("Green tea", new Ingredient[]
                {menu.getIngredient()[1],  menu.getIngredient()[5] });
        r[6].setIngredientWeight(0,150);
        r[6].setIngredientWeight(1,5);

        r[7] = new Recipe("Earl Gray tea", new Ingredient[]
                {menu.getIngredient()[1],  menu.getIngredient()[3],  menu.getIngredient()[6] });
        r[7].setIngredientWeight(0,150);
        r[7].setIngredientWeight(1,8);
        r[7].setIngredientWeight(2,5);

        return r;
    }

    private static Ingredient[] initIngredients(){
        Ingredient[] i = new Ingredient[10];

        i[0].setIngredient("milk",     0.02);
        i[1].setIngredient("water",    0.01);
        i[2].setIngredient("coffee",   0.50);
        i[3].setIngredient("sugar",    0.02);
        i[4].setIngredient("blacktea", 0.40);
        i[5].setIngredient("greentea", 0.40);
        i[6].setIngredient("earlgray", 0.40);
        i[7].setIngredient("chocolate",0.25);

        return i;
    }

}

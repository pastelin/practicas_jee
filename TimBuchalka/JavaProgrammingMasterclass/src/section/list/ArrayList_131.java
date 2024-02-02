package section.list;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() {
        /**
         * Regres una cadena formateada con tres especificadores
         * Especificador 1: es para un entero
         * Especificador 2 y 3: son especificadores de cadena
         */
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}

public class ArrayList_131 {

    public static void main(String[] args) {
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");


        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("milk"));
        groceryList.add(new GroceryItem("oranges", "PROCEDURE", 5));
        groceryList.add(0, new GroceryItem("Butter", "PROCEDURE", 6));
        groceryList.set(0, new GroceryItem("Butter", "PROCEDURE", 6));
        groceryList.remove(1);
        System.out.println(groceryList);


        System.out.println(groceryList);

    }

}

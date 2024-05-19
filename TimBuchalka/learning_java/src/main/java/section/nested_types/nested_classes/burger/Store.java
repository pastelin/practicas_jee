package section.nested_types.nested_classes.burger;

public class Store {

    public static void main(String[] args) {
        Meal regularMeal = new Meal();
        regularMeal.addToppings("Ketchup", "Mayo", "Bacon");
        System.out.println(regularMeal);

        Meal USRegularMeal = new Meal(.68);
        System.out.println(USRegularMeal);
    }
}

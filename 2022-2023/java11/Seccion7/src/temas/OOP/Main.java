package temas.OOP;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.setAdditions(new Addition("Tomato", 0.27));
        hamburger.setAdditions(new Addition("Lettuce", 0.75));
        hamburger.setAdditions(new Addition("Cheese", 1.12));
        hamburger.setAdditions(new Addition("Cheese", 1.12));
        hamburger.setAdditions(new Addition("Cheese", 1.12));
        hamburger.setAdditions(new Addition("Cheese", 1.12));
        System.out.println("Total Burger price is: " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.setAdditions(new Addition("egg", 5.43));
        healthyBurger.setAdditions(new Addition("Lentils", 3.41));

        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());

        DeluxeHamburger db = new DeluxeHamburger();
        db.itemizeHamburger();
        db.setAdditions(new Addition("otro", 5.3));
    }

}

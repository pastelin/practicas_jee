package temas.OOP;

public class DeluxeHamburger extends Hamburger {

    public DeluxeHamburger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        super.setAdditions(new Addition("Egg", 5.43));
        super.setAdditions(new Addition("Lentils", 3.41));
    }

    @Override
    public void setAdditions(Addition additions) {

        if(super.getAdditions().size() < 2) {
            super.setAdditions(additions);
        } else {
            System.out.println("You only can select 2 additions");

        }

    }
}

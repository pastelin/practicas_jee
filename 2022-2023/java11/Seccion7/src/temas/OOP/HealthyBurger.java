package temas.OOP;

import java.util.ArrayList;
import java.util.List;

public class HealthyBurger extends Hamburger{

    private List<Addition> extraAdditions;

    public HealthyBurger(String meat, Double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    @Override
    public void setAdditions(Addition additions) {

        if(super.getAdditions().size() <= 4) {
            super.setAdditions(additions);
        } else {
            if(this.extraAdditions == null) {
                this.extraAdditions = new ArrayList<>(super.getAdditions());
            }

            if(this.extraAdditions.size() < 6) {
                this.extraAdditions.add(additions);
            }
        }
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();

        if(this.extraAdditions != null) {
            for(Addition addition : this.extraAdditions) {
                hamburgerPrice += addition.getPrice();
            }
        }

        return hamburgerPrice;
    }
}

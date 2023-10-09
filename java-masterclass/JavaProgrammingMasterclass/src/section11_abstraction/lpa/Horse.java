package section11_abstraction.lpa;

public class Horse extends Mammal{
    public Horse(String type, String size, double wight) {
        super(type, size, wight);
    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType() + " sheds in the spring");
    }

    @Override
    public void makeNoise() {

    }
}

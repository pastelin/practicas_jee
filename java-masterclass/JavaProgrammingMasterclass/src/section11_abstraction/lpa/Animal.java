package section11_abstraction.lpa;

abstract class Mammal extends Animal {

    public Mammal(String type, String size, double wight) {
        super(type, size, wight);
    }

    @Override
    public void move(String speed) {
        System.out.println(getExplicitType() + " ");
        System.out.println(speed.equals("slow") ? "walks" : "runs");
    }

    public abstract void shedHair();
}

public abstract class Animal {

    protected String type;
    private String size;
    private double wight;

    public Animal(String type, String size, double wight) {
        this.type = type;
        this.size = size;
        this.wight = wight;
    }

    public abstract void move(String speed);

    public abstract void makeNoise();

    public final String getExplicitType() {
        return getClass().getSimpleName() + " (" + type + ")";
    }
}

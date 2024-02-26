package section.abstraction.interface_classes;

public class Truck implements Trackable {

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + " 's coordinates recorded");
    }
}

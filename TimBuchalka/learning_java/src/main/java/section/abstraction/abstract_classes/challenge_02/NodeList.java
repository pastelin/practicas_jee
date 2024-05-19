package section.abstraction.abstract_classes.challenge_02;

public interface NodeList {

    ListItem getRoot();

    boolean addItem(ListItem item);

    boolean removeItem(ListItem item);

    void traverse(ListItem item);

}

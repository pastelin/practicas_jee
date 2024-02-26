package section.abstraction.abstract_classes.challenge_02;

public class Node extends ListItem {
    public Node(Object value) {
        super(value);
    }

    @Override
    public ListItem next() {
        return this.rightLink;
    }

    @Override
    public ListItem setNext(ListItem listItem) {
        this.rightLink = listItem;
        return this.rightLink;
    }

    @Override
    public ListItem previous() {
        return this.leftLink;
    }

    @Override
    public ListItem setPrevious(ListItem listItem) {
        this.leftLink = listItem;
        return this.leftLink;
    }

    @Override
    public int compareTo(ListItem listItem) {

        if (listItem != null) {

            return ((String) super.getValue()).compareTo((String) listItem.getValue());

        } else {
            return -1;
        }
    }
}

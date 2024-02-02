package section.abstraction.abstract_classes.challenge_01;

public abstract class ProductForSale {

    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int qty) {
        return qty * price;
    }

    public void printPricedItem(int qty) {
        /*
        * %2d   : un numero entero se inprimira con dos digitos
        * %8.2f : numero decimal, con un flotante de dos digitos con un total de ocho digitos
        * %-15s : imprime una cadena, (-) siginifica justificar a la izquierda y el 15 el número de espacios que permite
        * */
        System.out.printf("%2d qty at $%8.2f each, %-15s %-35s %n", qty, price, type, description);
    }

    public abstract void showDetails();
}

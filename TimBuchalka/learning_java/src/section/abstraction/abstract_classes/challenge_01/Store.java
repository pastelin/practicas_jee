package section.abstraction.abstract_classes.challenge_01;

import java.util.ArrayList;

record OrderItem(int qty, ProductForSale product) {}

public class Store {

    private static ArrayList<ProductForSale> storeProductos = new ArrayList<>();

    public static void main(String[] args) {

        storeProductos.add(new ArtObject("oil Painting", 1350, "Impressionistic work by ABF painter in 2010"));
        storeProductos.add(new ArtObject("Sculpture", 2000, "Bronze work by JKF, produced in 1950"));
        storeProductos.add(new Forniture("Desk", 500, "Mahogany Desk"));
        storeProductos.add(new Forniture("Lamp", 200, "Tiffany Lamp with Hummingbirds"));

        listProducts();

        System.out.println("\n Order 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 1, 2);
        addItemToOrder(order1, 0, 1);
        printOrder(order1);

        System.out.println("\n Order 2");
        var order2 = new ArrayList<OrderItem>();
        addItemToOrder(order2, 3, 5);
        printOrder(order2);
    }

    public static void listProducts() {
        for(var item : storeProductos) {
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int qty) {
        order.add(new OrderItem(qty, storeProductos.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order) {
        double salesTotal = 0;

        for (var item : order) {
            item.product().printPricedItem(item.qty());
            salesTotal += item.product().getSalesPrice(item.qty());
        }
        System.out.printf("Sales Total = $%6.2f %n", salesTotal);
    }
}

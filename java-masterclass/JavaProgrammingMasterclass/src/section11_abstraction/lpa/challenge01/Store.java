package section11_abstraction.lpa.challenge01;

import java.util.ArrayList;

public class Store {

    private static ArrayList<ProductForSale> storeProductos = new ArrayList<>();

    public static void main(String[] args) {

        storeProductos.add(new ArtObject("oil Painting", 1350, "Impressionistic work by ABF painter in 2010"));
        storeProductos.add(new ArtObject("Sculpture", 2000, "Bronze work by JKF, produced in 1950"));

    }
}

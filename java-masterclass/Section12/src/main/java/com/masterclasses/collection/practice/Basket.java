package com.masterclasses.collection.practice;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Basket {

    private final String name;
    private final Map<StockItem, Integer> list;

    public Basket(String name) {
        this.name = name;
        this.list = new TreeMap<>();
    }

    public int addToBasket(StockItem item, int quantity) {
        if( (item != null) && (quantity > 0)) {
            int inBasket = list.getOrDefault(item, 0);
            list.put(item, inBasket + quantity);
            return inBasket;
        }

        return 0;
    }

    public Map<StockItem, Integer> items() {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("\n Shopping basket ").append(name).append(" contains ").append(list.size() );
        sb.append((list.size() == 1) ? "item" : "items \n");
        double totalCost = 0.0;

        for(Map.Entry<StockItem, Integer> item : list.entrySet()) {
            sb.append(item.getKey()).append(". ").append(item.getValue()).append(" purchased\n");
            totalCost += item.getKey().getPrice() * item.getValue();
        }

        sb.append("Total cost ").append(totalCost);
        return "Basket{}";
    }
}

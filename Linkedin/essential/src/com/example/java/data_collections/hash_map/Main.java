package com.example.java.data_collections.hash_map;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

        map.put("California", "Sacramento");
        map.put("Oregon", "Salem");
        map.put("Washington", "Olympia");
        System.out.println(map);

        map.put("Alaska", "Juneau");
        System.out.println(map);

        String cap = map.get("Oregon");
        System.out.println("The capital of Oregon is " + cap);

        map.remove("California");
        System.out.println(map);

    }

}

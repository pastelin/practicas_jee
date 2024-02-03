package com.example.java.custom_classes.instance_static_methods;

import com.example.java.custom_classes.instance_static_methods.model.Olive;
import com.example.java.custom_classes.instance_static_methods.model.OliveName;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Olive> olives = new ArrayList<>();
        olives.add(new Olive(OliveName.KALAMATA, 0x2E0854, 3));
        olives.add(new Olive(OliveName.KALAMATA, 0x2E0854, 3));
        olives.add(new Olive(OliveName.KALAMATA, 0x2E0854, 2));

        OlivePress press = new OlivePress();

        int totalOil = press.getOil(olives);
        System.out.println("Total Olive oil: " + totalOil);

    }

}


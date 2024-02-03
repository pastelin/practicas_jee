package com.example.java.custom_classes.instance_static_methods.model;

public enum OliveName {

    KALAMATA("Kalamata"), LIGURIAN("Lugurian");

    private String name;
    OliveName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

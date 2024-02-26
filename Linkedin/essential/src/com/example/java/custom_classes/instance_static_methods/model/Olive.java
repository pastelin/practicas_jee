package com.example.java.custom_classes.instance_static_methods.model;

public class Olive {

    public static final String KALAMATA = "Kalamata";
    public OliveName name = OliveName.KALAMATA;
    public long color = 0x2E0854;
    public int oil = 3;

    public Olive() {}

    public Olive(OliveName name, long color, int oil) {
        this.name = name;
        this.color = color;
        this.oil = oil;
    }

    public OliveName getName() {
        return name;
    }

    public void setName(OliveName name) {
        this.name = name;
    }

    public long getColor() {
        return color;
    }

    public void setColor(long color) {
        this.color = color;
    }

    public int crush() {
        System.out.println("Ouch!!!");
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }
}

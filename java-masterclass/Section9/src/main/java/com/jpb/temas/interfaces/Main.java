package com.jpb.temas.interfaces;

public class Main {

    public static void main(String[] args) {

        ITelephone juanTelephone;
        juanTelephone = new DeskPhone(123465789);
        juanTelephone.powerOn();
        juanTelephone.callPhone(123456789);
        juanTelephone.answer();

        juanTelephone = new MobilePhone(23567897);
        juanTelephone.powerOn();
        juanTelephone.callPhone(23567897);
        juanTelephone.answer();
    }

}

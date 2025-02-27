package com.lab.lab10;

import java.util.ArrayList;

public class Lab10 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

        Tara tara = new Tara("Дерево", 10.0, 20.0, 15.0);
        PostalDispatch dispatch = new PostalDispatch("Посилка", 5.0, 100.0, 50.0);
        ElectroDevice device = new ElectroDevice("Лампа", 0.5, 220.0);

        Byte byteValue = 10;
        Character charValue = 'A';

        list.add(tara);
        list.add(dispatch);
        list.add(device);
        list.add(byteValue);
        list.add(charValue);

        for (Object obj : list) {
            System.out.println(obj.toString());
            System.out.println("HashCode: " + obj.hashCode());
        }
    }
}

package com.example.learnjava;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList employees = new ArrayList();

        employees.add("Salim");
        employees.add("Sai");

        System.out.println(employees.get(0));

        employees.remove("Salim");

        System.out.println(employees.get(0));


    }
}

package com.example.learnjava;

public class StringDemo {

    public static void main(String[] args) {
        String username = "SAM";
        System.out.println(username.toLowerCase());

        int accBal = 400;
        String balStr = String.format("Your account balance is %d", accBal);
        System.out.println(balStr);


    }
}

package com.example.learnjava;

public class Variables {

    public static void main(String[] args) {
        String user = "Sam";
        int erp = 2;
        float lBalance = 12.2f;

        System.out.println(user + " who's erp: " + erp + ", has leave Balance: " + lBalance);

        //Took 2 days leave
        lBalance = lBalance - 2;

        System.out.println(user + " who's erp: " + erp + ", took 2 day leave now leave Balance is: " + lBalance);

    }
}

package com.example.learnjava;

public class MethodDemo {

    public static void main(String[] args) {
        printName();

        int erp = 23;
        int bal = 12;
        printLeaveBalance(erp, bal);

        String bUnit = getBusinessUnit(erp);

        System.out.println("Business Unit: " + bUnit);
    }

    public static void printName(){
        System.out.println("My name is Salim");
    }

    public static void printLeaveBalance(int erp, int bal) {
        System.out.println("Leave Balance of Erp: " + erp + ", is : " + bal);
    }

    public static String getBusinessUnit(int erp) {
        return "HR";
    }
}

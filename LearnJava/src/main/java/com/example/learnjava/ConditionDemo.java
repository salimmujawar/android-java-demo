package com.example.learnjava;

public class ConditionDemo {

    public static void main(String[] args) {
        int lBal = 25;
        int aLeave = 4;

        //<, >, ==, <=, >=

        if (aLeave <= lBal) {
            System.out.println("You can apply your leave of Days: " + aLeave);
        } else if ( aLeave > 23 && aLeave <= lBal) {
            System.out.println("You must have min 2 Day Balance");
        } else {
            System.out.println("You don't have sufficient Leave Balance!");
        }

        boolean isDoctor = true;
        boolean isSupervisor = false;

        if (isDoctor || isSupervisor) {
            System.out.println("You have a monthly Leave balance of 2.8");
        }

    }
}

package com.example.learnjava;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] leaveHistory = new int[3];

        leaveHistory[0] = 2;
        leaveHistory[1] = 4;
        leaveHistory[2] = 10;

        System.out.println("First Leave " + leaveHistory[0]);
        System.out.println("Second Leave " + leaveHistory[1]);
        System.out.println("Third Leave " + leaveHistory[2]);

        String[] empNames = new String[3];

        empNames[0] = "Salim";
        empNames[1] = "Sai";
        empNames[2] = "Arif";

        System.out.println("First Employee " + empNames[0]);
        System.out.println("Second Employee " + empNames[1]);
        System.out.println("Third Employee " + empNames[2]);


        String[] top5Emp = {
            "Salim", "Vijay", "Sai", "Pasha", "Arif"
        };

        System.out.println(top5Emp[4]);

        System.out.println("Total Employes: " + top5Emp.length);

        System.out.println("Last Employes: " + top5Emp[top5Emp.length -1 ]);


    }
}

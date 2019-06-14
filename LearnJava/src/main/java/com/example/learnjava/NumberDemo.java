package com.example.learnjava;

public class NumberDemo {

    public static void main(String[] args) {
        int age =25;

        int sum = 5 + 5;
        int difference = 5 - 1;
        int product = 5 * 5;
        int divide = 5 / 5;
        int reminder = 5 % 5;

        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);
        System.out.println(divide);
        System.out.println(reminder);


        //Float: 32-bit storage only also need to type cast by prefix f

        float leaveBal = 12.29f;

        System.out.println(leaveBal);

        //Double: 64 bit storage, Java recommends to use this

        double area = 523.334;


        //Long: for big wole numbers

        long accNum = 100000000;


        Integer num = 550;

        String myStr = num.toString();

        System.out.println(myStr);



    }

}

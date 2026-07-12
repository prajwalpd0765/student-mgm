package com.app;


import  java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void  printJava(){
        System.out.println("Hellooooo Javaaaaaaa");

    }
    public static void printName(String name){
        System.out.println(name);
    }

    public static void printSum(int a , int b) {
        int sum =  a + b;
        System.out.println(sum);
    }
    static void main() {
// double a = 567;
//
//               double b = 876;
//                double sum = a+b;
//                double sub = a-b;
//                double multi = a*b;
//                double div = a/b;
//                double reminder = a%b;
//
//        System.out.println(sum);
//        System.out.println(sub);
//        System.out.println(multi);
//        System.out.println(div);
//        System.out.println(reminder);
//
//
//        int sum1 = 100 + 50;
//        int sum2 = sum1 + 250;
//        int sum3 = sum2 + sum2;
//        System.out.println(sum3);


//         maths operator
//        System.out.println(Math.min(5,6));

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input Your Age:");
//        int age=sc.nextInt();
//        System.out.println(age);
//        System.out.println("enter Your Name");
//        String name=sc.next();
//        System.out.println(name.length());


//        int[] marks = {97, 98, 95};
//
//        int[][] Finalmarks = {{97, 98, 95}, {95, 95, 98}};
//        System.out.println(Finalmarks[0][1]);


        // CASTING
//        double price = 100.00;
//        double finalPrice = price + 18;
//        System.out.println(finalPrice);
//
//        int pricee = 100;
//        int finalprice = (int)18.0;
//        System.out.println(finalprice);

//        CONSTANTS
//        final float PI = 3.14F;
//        System.out.println(PI);


//        OPERATORS

//        double a = 3;
//        double b = 5;
//        double Modulo = a % b;
//        System.out.println(Modulo);

//        Maths Class
//        System.out.println((int)(Math.random()*100));

//        How to take Input???

//      Scanner sc = new Scanner(System.in);
//
//        System.out.println("Input Your Name : ");
//        String name = sc.nextLine();
//        System.out.println(name);

//        COMPARISON OPERATORS
//        a == b
//        a != b
//        a < b
//        a > b
//        a <= b
//        a >= b

//        CONDITIONAL STATEMENTS
//        boolean Issunup = false;
//        if (Issunup == true)
//            System.out.println("day");
//        else
//            System.out.println("night");
//
//        int age = 17;
//        if (age > 18)
//            System.out.println("Can Vote");
//        else
//            System.out.println("Can't vote");

//        LOGICAL OPERATORS
//        &&
//        int a = 60;
//        int b = 20;
//
//        if (a < 50 && b < 50)
//            System.out.println(" Both Less Than 50");

//        ||
//        if (a < 50 || b < 50)
//            System.out.println("atleast one less than 50");

//        int n = 2;
//
//        if (n % 2 == 0)
//            System.out.println("Given Number Is Even");
//
//        else
//            System.out.println("Given Number Is Odd");




//        Conditional statement


//        Scanner sc = new Scanner(System.in);

//        pen = 10 ; notebook = 40

//        int cash = sc.nextInt();
//        if ( cash < 10 ) {
//            System.out.println("Cannot Buy Anything");
//            System.out.println("Get Some More Cash");
//
//        } else if ( cash > 10 && cash < 50) {
//            System.out.println("Can Get 1 thing");
//
//        }
//        else {
//            System.out.println("Can Get Both");
//        }



//       Conditional statement : Switch
//       Scanner sc = new Scanner(System.in);
//
//       int dayno = sc.nextInt();
//
//
//
//        switch (dayno) {
//
//            case 1 :
//                System.out.println("Monday");
//                break;
//
//            case  2:
//                System.out.println("Tuesday");
//                break;
//
//            default:
//                System.out.println("Wed-Sun");
//        }


//        LOOPS

//        for (int i = 100 ; i >= 1; i-- ) {
//            System.out.println(i);
//        }

//        While Loop
//         int j = 100;
//         while (j >= 1) {
//             System.out.println(j);
//             j--;
//         }

//        Do While Loop

//        int k = 100;
//        do {
//            System.out.println(k);
//            k--;
//        } while (k >= 1);


//        Scanner sc = new Scanner(System.in);
//        int number = 0;
//
//        do {
//            System.out.println("input your number");
//            number = sc.nextInt();
//            System.out.print("here is your number : ");
//            System.out.println(number);
//
//        } while (number >= 0);
//
//        System.out.println("THE END");

//        Break & Continue
//        int i = 0;
//        while (true) {
//            if (i == 3) {
//                i++;
//                continue;
//            }
//
//            System.out.println(i);
//            i++;
//            if (i>5){
//                break;
//            }
//
//        }

//        TRY - CATCH in EXCEPTION HANDING

//        int[] marks = {98, 97, 95};
//        try {
//            System.out.println(marks[5]);
//        } catch (Exception expection) {
//            do something after catching
//        }
//        System.out.println("Hellooooooooo!!!!!");

//        METHODS
//        printJava();
//        printJava();
//        printJava();

//        printName("Prajwal");
//        printName("yash");


//       printSum(1, 3);

//        MINI PROJECT
        int myNumber= (int)(Math.random()*100);
        int usernumber = 0;
        Scanner sc  = new Scanner(System.in);

        do {
            System.out.println("Guess My Number : ");
             usernumber = sc.nextInt();

            if(usernumber == myNumber){
                System.out.println("WOOHOO .. CORRECT NUMBER!!!!!!!!!");
                break;
            }
            else if (usernumber > myNumber) {
                System.out.println("Your Number Is Large");
            }
            else {
                System.out.println("Your Number Is Small");
            }
        } while (usernumber >= 0);

        System.out.print("My number was : ");
        System.out.println(myNumber);





































    }
    }


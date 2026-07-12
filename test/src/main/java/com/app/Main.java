package com.app;

import java.util.Arrays;

public class Main {
    static void main() {

        //ONE ARRAY TO STORE 10 STUDENTS NAMES, AND 1 2D ARRAY TO STORE MARKS OF EACH STUDENT IN 7 SUBJECTS
        String[] name = new String[10];
        name[0] = "student 1";
        name[1] = "student 2";
        name[2] = "student 3";
        name[3] = "student 4";
        name[4] = "student 5";
        name[5] = "student 6";
        name[6] = "student 7";
        name[7] = "student 8";
        name[8] = "student 9";
            name[9] = "student 10";

        int[][] marks = {{56, 57, 58, 59, 90, 87, 78},
                {67, 45, 34, 34, 77, 90, 87},
                {56, 98, 89, 76, 55, 34, 78},
                {66, 67, 67, 99, 78, 45, 99},
                {66, 67, 67, 99, 78, 45, 99},
                {66, 67, 67, 99, 78, 45, 99},
                {66, 67, 67, 99, 78, 45, 99},
                {66, 67, 67, 99, 78, 45, 99},
                {66, 67, 67, 99, 78, 45, 99},
                {66, 67, 67, 99, 78, 45, 99}};

        for(int i = 0; i < name.length; i++){
            System.out.println("Marks of : " + name[i] + "are as follows");
            for(int j = 0; j < marks[i].length; j++){
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }




    }
    }


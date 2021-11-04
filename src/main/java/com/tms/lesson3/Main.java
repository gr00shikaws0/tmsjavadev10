package com.tms.lesson3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        long [] arr = new long[10];
        boolean[] arrBoolean = new boolean[2];
        String [] arrString = new String[5];
        char [] arrChar = new char[10];
        System.out.println(arrBoolean[0]);
        System.out.println(arr[0]);
        System.out.println(arrString[0]);
        System.out.println(arrChar[0]);

        int [] arrInt1 = new int[5];
        arrInt1[0] = 10;
        arrInt1[1] = 20;
        System.out.println(arrInt1[1]);

        int [] arrInt2 = {2, 4, 6, 8, 10};
        System.out.println(arrInt2[2]);

        int [] arrInt3 = new int[] {3, 5, 7, 9};
        System.out.println(arrInt3[3]);

        int [] arrInt4 = {1, 4, 7, 90};
        System.out.println(arrInt4[arrInt4.length - 1]);

        String [] arrString1 = {"Vasya", "Petsya", "Olya"};
        for (int count = 0; count < arrString1.length; count++) {
            System.out.println(arrString1[count]);
        }

        for (String userName : arrString1) {
            System.out.println(userName);
        }

        System.out.println(arrString1);

        String[] arrString1ext = new String[arrString1.length + 1];
        for (int count  = 0; count < arrString1.length; count ++) {
           arrString1ext[count] = arrString1[count];
        }
        arrString1ext[arrString1ext.length - 1] = "Sveta";
        for(String name : arrString1ext) {
            System.out.println(name);
        }

        int [] arrInt5 = {6, 0, 2, 10, -5, 4};
        int [] arrInt6 = {6, 0, 2, 10, -5, 4};
        int [] arrForCopy = new int[20];
        Arrays.sort(arrInt5);
        String arrString2 = Arrays.toString(arrInt5);
        System.out.println(arrString2);
        int[] ints = Arrays.copyOf(arrInt5, 4);
        System.out.println(Arrays.toString(ints));
        String [] textArray = new String[5];
        Arrays.fill(textArray, "hello");
        System.out.println(Arrays.toString(textArray));
        System.out.println(Arrays.binarySearch(arrInt5, 4));
        System.out.println(Arrays.equals(arrInt5, arrInt6));
        System.arraycopy(arrInt5, 2, arrForCopy, 5, 2);
        System.out.println(Arrays.toString(arrForCopy));

        int [][] duoArray = new int[2][5];

        int [][] duoArray1 = new int[3][];
        duoArray1[0] = new int[4];
        duoArray1[1] = new int[6];
        duoArray1[2] = new int[2];

        duoArray1[0][0] = 5;
        duoArray1[0][1] = 10;
        duoArray1[1][0] = 2;
        duoArray1[1][1] = 5;

        System.out.println(Arrays.deepToString(duoArray));

        String [][] dictionary = new String[5][2];
        dictionary[0][0] = "Дом";
        dictionary[0][1] = "Home";
        dictionary[1][0] = "Кот";
        dictionary[1][1] = "Cat";

        System.out.println(Arrays.deepToString(dictionary));

    }

}

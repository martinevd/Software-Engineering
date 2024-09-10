package org.example;

import java.util.Arrays;

public class Pgcd {

    public static int euclide(int a, int b){

        if(b == 0){
            return a;
        }

        int r = a;
        while (r - b >= 0) {
            r = r - b;
        }

        return euclide(b,r);
    }
    public static void main(String[] args) {
       System.out.println(euclide(21,15));
    }
}

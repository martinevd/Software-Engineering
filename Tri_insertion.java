package org.example;


import java.util.Arrays;

public class Tri_insertion {
    public static void triInsertion(int[] array){
        for (int i = 1; i < array.length; i++) {
            int val = array[i];
            int j = i;
            while (j > 0 && val < array[j - 1]) {
                array[j] = array[j - 1];
                j = j - 1;
            }
            array[j] = val;
        }
    }
    public static void main(String[] args) {
        int[] numbers = {4,1,3,2};
        triInsertion(numbers);
        System.out.println(Arrays.toString(numbers));
    }

}

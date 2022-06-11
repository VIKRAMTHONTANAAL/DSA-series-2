package main.java.Practice;

import java.util.Arrays;
import java.util.Collections;

public class SortingElements {

    public static void main(String[] args) {
        Integer arr[]={30,50,20,10,60};
//Arrays.parallelSort(arr);
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));



    }
}

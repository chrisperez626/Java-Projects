package edu.princeton.cs.algs4;
import java.util.*;
import java.io.*;

public class binarySearch {

    static int binarySearch(int arr[], int x){

        int l = 0, r = arr.length - 1;
        while(l <= r) {

            int m = l + (r - l) / 2;

            if(arr[m] == x){
                return m;
            }
            if(arr[m] < x) {
                l = m + 1;
            }
            if(arr[m] > x){
                r = m - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int[] arr = { 2, 5, 13, 17, 24, 28, 35, 40, 46, 50, 57};

        System.out.println(binarySearch(arr, 5));

    }


}
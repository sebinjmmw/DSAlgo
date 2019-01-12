package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String args[]) {
        //enter input here
        int[] arr = {2,2,3,3,4,4,4,4};
        int count=1,j=-1,i;
        for (i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count = count + 1;
            } else {
                arr[j+1]=arr[i-1];
                arr[j+2]=count;
                count=1;
                j=j+2;
            }
        }
        arr[j+1]=arr[i-1];
        arr[j+2]=count;
        for(i=0;i<=j+2;i++) {
            System.out.println(arr[i]);
        }
    }

    //without the restriction of numbers repeating atleast twice, final output array will be larger than original.
    //this will involve shifting of elements which is computation intensive.
    //so trade off with extra space - use new array or store in hash.
}

package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayRotation {


    public static void main(String[] args) {

        ArrayList<Integer> intLst = new ArrayList<>();
        for(int i = 1; i <= 6; i++) {
            intLst.add(i);
        }
        System.out.println(intLst);

        int k = 1;

        Collections.reverse(intLst);
        Collections.reverse(intLst.subList(0,k));
        Collections.reverse(intLst.subList(k, intLst.size()));
        System.out.println(intLst);
        // k units to left is equivalent to n-1 units to right
    }





}

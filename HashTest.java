package com.company;

    import java.util.HashMap;
    import java.util.Scanner;

public class HashTest {

    //strictly no duplicates and in O(n)

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        HashTestMain(readNumbersFromConsole(), input.nextInt());
    }


    private static int[] readNumbersFromConsole() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++)
            numbers[i] = scanner.nextInt();
        return numbers;
    }

    private static void HashTestMain(int arr[], int target) {
        HashMap<Integer, Integer> countHash = new HashMap<>();
        int count;
        for (int k : arr) {
            if (countHash.containsKey(k)) {
                count = countHash.get(k);
                count++;
                countHash.put(k, count);                  //store frequency of array elements in hash
            } else {
                countHash.put(k, 1);
            }
        }

        for(int i : countHash.keySet()) {
            int j = target - i;
            if( countHash.containsKey(j) && countHash.get(j) > 0) {
                System.out.format("%s : %s %n", j, i);
                countHash.put(i,0);                       // null the complement element to prevent duplicates
            }
        }
    }
}




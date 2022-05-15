package com.salgaonkar.odd.occurance;

public class OddOccurance {

    public static void main(String[] args) {
        int arr[] = new int[]{ 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 };
        System.out.println(getOddOccurrence(arr, arr.length));
    }

    private static int getOddOccurrence(int[] arr, int arraySize) {
        int i;
        for (i = 0; i < arraySize; i++) {
            int count = 0;
            for (int j = 0; j < arraySize; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count % 2 != 0)
                return arr[i];
        }
        return -1;
    }
}

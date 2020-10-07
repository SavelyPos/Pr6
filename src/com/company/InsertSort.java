package com.company;

import java.util.Arrays;

public class InsertSort {
    public void InsertionSort (int[] idNumbers) {
        for (int i  = 0; i < idNumbers.length; i++)
        {
            int ind = i;
            int temp = idNumbers[i];
            while (ind > 0 && idNumbers[ind - 1] >= temp)
            {
                idNumbers[ind] = idNumbers[ind-1];
                ind--;
            }
            idNumbers[ind] = temp;
        }
        System.out.println(Arrays.toString(idNumbers));
    }
}

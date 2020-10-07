package com.company;

public class MergeSort {
    public static Student[] mergeSort(Student[] arr2, Student[] arr3) {
        Student[] arr4 = new Student[arr2.length + arr3.length];

        int i = 0, j = 0;
        for (int k = 0; k < arr4.length; k++) {

            if (i > arr2.length - 1) {
                Student a = arr3[j];
                arr4[k] = a;
                j++;
            } else if (j > arr3.length - 1) {
                Student a = arr2[i];
                arr4[k] = a;
                i++;
            } else if (arr2[i].getPoints() < arr3[j].getPoints()) {
                Student a = arr2[i];
                arr4[k] = a;
                i++;
            } else {
                Student b = arr3[j];
                arr4[k] = b;
                j++;
            }
        }
        return arr4;
    }
}
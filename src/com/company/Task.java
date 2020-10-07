package com.company;

import java.util.Arrays;
import java.util.Scanner;
public class Task {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);;
        Student st1 = new Student(1840, 150);
        Student st2 = new Student(1580, 270);
        Student st3 = new Student(2050, 240);

        int[] arr = new int[]{st1.getIdNumber(), st2.getIdNumber(), st3.getIdNumber()};
        Student[] arr2 = new Student[]{st1, st2, st3};
        Student[] arr3 = new Student[]{ new Student(1000,100),
                new Student(2000,200),
                new Student(3000,300)};


        System.out.println("Выберете параметр для сортировки:\n1 - по ID\n2 - по итоговым баллам\n3 - слияние");
        int num = scn.nextInt();

        switch (num)
        {
            case 1:
                InsertSort ISort = new InsertSort();
                ISort.InsertionSort(arr);
                break;
            case 2:
                SortingStudentsByGPA comparePoints = new SortingStudentsByGPA();
                Arrays.sort(arr2, comparePoints);
                // QuickSort QSort = new QuickSort();
                //  QSort.quickSort(arr2, 0, arr.length-1);

                System.out.println(Arrays.toString(arr2));
                break;
            case 3:
                MergeSort MSort = new MergeSort();

                //  for(int i=0;i<3;i++){
                //   System.out.println(arr2[i]+"\t"+arr3[i]);
                // }
                Arrays.sort(arr2, new SortingStudentsByGPA());
                Arrays.sort(arr3, new SortingStudentsByGPA());
                Student[] arr4 = MSort.mergeSort(arr2,arr3);
                System.out.println();
                for(int i=0;i<6;i++){
                    System.out.println(arr4[i]);
                }
            default:
                break;
        }
    }
}
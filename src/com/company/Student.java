package com.company;

import java.util.Arrays;

public class Student implements Comparable<Student>{
    private final int idNumber;
    private final int points;

    @Override
    public int compareTo(Student s)
    {
        if(this.idNumber > s.getIdNumber())
            return 1;
        else if (this.idNumber == s.getIdNumber())
            return 0;
        else
            return -1;
    }

    public Student(int idNumber, int points)
    {
        this.idNumber = idNumber;
        this.points = points;
    }

    public int getIdNumber()
    {
        return idNumber;
    }

    public int getPoints()
    {
        return points;
    }

    public String toString()
    {
        return "Student{" +
                " Points =" + points +
                " ID=" + idNumber +
                '}';
    }

}
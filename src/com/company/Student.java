package com.company;

public abstract class Student {
    private double GPA;
    public Student(String firstName, String familyName, double GPA)
    {
        this.GPA= GPA;
    }
    public abstract String toString();
    public double getGPA()
    {
        return GPA;
    }
    public void setGPA(double GPA)
    {
        this.GPA = GPA;
    }

    public boolean equals(Student student){
        if(this.GPA == (student.getGPA()))
        {
            return true;
        }
        else return false;
    }
}

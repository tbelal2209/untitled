package com.company;

public class Runner {
    public static String[] firstNames = {"Jacky","Runnie","Zhi"};
    public static String[] familyNames = {"Thunder","Sky","Brick"};
    public static void main (String [] arge)
    {
        Student[] students = new Student[34];
        for (int i = 0; i<34; i++)
        {
            students[i] = randomStudent();
        }
        Teacher teach = new Teacher("Folwell", "Nathan","Mr.", "CSA");
        Classroom ourClass = new Classroom(students,teach);
        ourClass.printClass();
    }
}

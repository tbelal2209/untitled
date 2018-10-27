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
        Teacher teach = new Teacher("Folwell", "Nathan", "Mr.", "CSA") {
            @Override
            public String toString() {
                return null;
            }
        };
        Classroom ourClass = new Classroom(students, teach) {
            @Override
            public String toString() {
                return null;
            }

            @Override
            public void printClass() {

            }
        };
        ourClass.printClass();
    }
    public static Student randomStudent() {
        String firstName = firstNames[(int) (Math.random() * firstNames.length)];
        String familyName = familyNames[(int) (Math.random() * familyNames.length)];
        Double GPA = Math.random() * 4.0;

        Student stu = new Student(firstName, familyName, GPA) {
            @Override
            public String toString() {
                return null;
            }
        };

        return stu;
    }
    }

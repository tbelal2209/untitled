package com.company;

public abstract class Classroom {
    private String Subject;
    private int Students;
    public Classroom (String Subject ,int  Students){
        this. Subject = Subject ;
        this. Students = Students;
        }

    public abstract String toString();
    public String getSubject()
    {
        return Subject;
    }
    public void setSubject(String Subject)
    {
        this.Subject = Subject;
    }
    public int getStudents() {
        return Students;
    }
    public void setStudents(int Students) {
        this.Students = Students;
    }


    public boolean equals(Classroom classroom){
        if(this.Subject.equals(classroom.getSubject())&& this.Students==(classroom.getStudents()))
        {
            return true;
        }
        else return false;
    }

    public abstract void printClass();
}

public class (double GPA){
int arrayLength = arr.length;
int sum = IntStream.of(GPA).sum();
  sum/ arr.length = classsAvg;)
    System.out.println ( "The class Average is" + classAvg)

    

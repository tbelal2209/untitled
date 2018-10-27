package com.company;

public abstract class Teacher {
    private String Subject;
    private String Title;
    public Teacher(String folwell, String nathan, String Subject, String Title)
    {
        this.Subject= Subject;
        this.Title= Title;
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
    public String getTitle() {
        return Title;
    }
    public void setTitle(String Title) {
        this.Title = Title;
    }


    public boolean equals(Teacher teacher){
        if(this.Subject.equals(teacher.getSubject())&& this.Title.equals(teacher.getTitle()))
        {
            return true;
        }
        else return false;
    }
}

package com.codegym;

public class Student {


    int id;
    String name;
    int classId;
    String email;
    float mathScore;
    float historyScore;

    public Student() {

    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(int id, int classId, float mathScore, float historyScore) {
        this.id = id;
        this.classId = classId;
        this.mathScore = mathScore;
        this.historyScore = historyScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classId=" + classId +
                ", email='" + email + '\'' +
                ", mathScore=" + mathScore +
                ", historyScore=" + historyScore +
                '}';
    }

    public float gpa() {
       return  (this.mathScore + this.historyScore) / 2;
    }

    public static void main(String[] args) {
        Student student = new Student(2, "Nam");
        student.classId = 2;
        student.historyScore = 7.8f;
        student.mathScore = 8.2f;
        student.email = "@gmail.com";

        System.out.println(student.gpa());
        System.out.println(student.toString());
        Student student1= new Student(1,2,4,6);
        student1.name="Binh";
        System.out.println(student1.toString());

    }


    }


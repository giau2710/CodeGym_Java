package demoComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(20, "Tan"));
        studentList.add(new Student(23, "Hoang"));
        studentList.add(new Student(21, "Thanh"));
        System.out.println(studentList);

        Collections.sort(studentList,new StudentComparator());
        Collections.reverse(studentList);
        System.out.println(studentList);
    }
}


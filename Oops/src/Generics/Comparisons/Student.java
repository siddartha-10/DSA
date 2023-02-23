package Generics.Comparisons;

public class Student implements Comparable<Student> {
    // here comparable is an interface we are implementing and interface of type student because we want to compare
    // student objects
    int rollno;
    float marks;
    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks - o.marks);
        return diff;
    }
}

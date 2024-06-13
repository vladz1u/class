package school;

import java.util.ArrayList;

public class StudentManager {
    ArrayList<Grade> listGrades = new ArrayList<>();
    ArrayList<Student> listStudents = new ArrayList<>();

    public void addStudent(Student student) {
        listStudents.add(student);
    }

    public void printStudents() {
        for (Student student : listStudents) {
            System.out.println(student.toString());
        }
    }

    public void addGrade(Grade grade) {
        boolean logic = false;
        for (Student student : listStudents) {
            if (student.id == grade.student.id) {
                logic = true;
            }
        }
        if (logic) {
            listGrades.add(grade);
        } else
            System.out.println("There is no such student in the list");
    }

    public void printGrades() {
        for (Grade grade : listGrades){
            System.out.println(grade.toStringGrade());
        }
    }

    public void getAverageGrade(int id) {
        double averageGrade = 0;
        boolean logic = false;
        int count = 0;
        for (Grade grade : listGrades) {
            if (grade.student.id == id) {
                count++;
                logic = true;
                averageGrade += grade.grade;
            }
        }
        if (logic) {
            averageGrade = averageGrade / count;
            System.out.println("Average grade of student which id is " + id + " is " + averageGrade);
        } else
            System.out.println("There is no such student in the list");
    }

}

package school;

public class main {
    public static void main(String[] args){
        Student student1 = new Student("Jonh", 1, 13);
        Student student2 = new Student("Ivan", 2, 17);
        Student student3 = new Student("Vlad", 3, 15);

        StudentManager studentManager = new StudentManager();

        studentManager.addStudent(student1);
        studentManager.addStudent(student2);
        studentManager.addStudent(student3);


        Grade grade1 = new Grade(student1, "math", 12);
        Grade grade2 = new Grade(student1, "history", 11);
        Grade grade3 = new Grade(student1, "PE", 10);

        studentManager.addGrade(grade1);
        studentManager.addGrade(grade2);
        studentManager.addGrade(grade3);

        studentManager.printGrades();

        studentManager.getAverageGrade(1);
    }
}

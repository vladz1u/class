package school;

public class Grade {
    Student student;
    String subject;
    double grade;

    public Grade(Student student, String subject, double grade) {
        this.student = student;
        this.subject = subject;
        this.grade = grade;
    }

    public String toStringGrade(){
        return "student: " + student.name + " subject: " + subject + " grade " + grade;
    }

}

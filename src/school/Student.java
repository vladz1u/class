package school;

public class Student {
    String name;
    int id;
    int age;

    public Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String toStringStudent(){
        return "name: " + name + "| age: " + age + "| id: " + id;
    }

}

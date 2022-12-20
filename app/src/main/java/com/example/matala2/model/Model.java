package com.example.matala2.model;
import java.util.LinkedList;
import java.util.List;

public class Model {
    private static final Model _instance = new Model();

    public static Model instance(){
        return _instance;
    }
    private Model(){
        addStudent(new Student("shir", "207378837", "052361256", "uhngjf", "",false));
        addStudent(new Student("Lir", "852369741", "052361256", "uhngjf", "",false));
        addStudent(new Student("ron", "789654123", "052361256", "uhngjf", "",false));
        addStudent(new Student("daniel", "741258398", "052361256", "uhngjf", "",false));
        addStudent(new Student("daniel", "741258398", "052361256", "uhngjf", "",false));
        addStudent(new Student("daniel", "4444444", "052361256", "uhngjf", "",false));
        addStudent(new Student("daniel", "85236951", "052361256", "uhngjf", "",false));
    }

    List<Student> data = new LinkedList<>();
    public List<Student> getAllStudents(){
        return data;
    }

    public void addStudent(Student st){
        data.add(st);
    }

}

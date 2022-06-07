package Student;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private int age;
    private String name;
    private String lastname;
    private ArrayList<Boolean> headman;

    public Student(int age, String name, String lastname, ArrayList<Boolean> headman){
        this.age = age;
        this.name = name;
        this.lastname = lastname;
        this.headman = headman;
//        this.groups = new ArrayList<>();
    }

    public Student() {

    }

    public void newNameOfStudent(List<String> nameStudent){
        if (name != null ) {
            name = "Enter new Name";
        }
    }


//    public Student.Student(int age, String name, String lastname, List<String> groups){
//        this.age = age;
//        this.name = name;
//        this.lastname = lastname;
//        this.groups = groups;
//    }
//
//    public void setGroups(List<String> groups){
//        if (groups == null) {
//            groups = new ArrayList<>();
//        }
//        this.groups = groups;
//    }
//
//    public List<String> getGroups(){
//        return this.groups;
//    }
//
//    public Student.Student(){
//    }
}

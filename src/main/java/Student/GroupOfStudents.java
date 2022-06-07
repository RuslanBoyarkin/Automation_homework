package Student;

import java.util.ArrayList;
import java.util.List;

public class GroupOfStudents {
    public Student headman;
    public List<Student> student;
    public List<String> tasks;
    public Boolean status;

    public void Tasks(Boolean status, List<Student> student){
        this.status = status;
        this.student = student;
    }

    public GroupOfStudents(Student headman, List<Student> student, List<String> tasks){
        this.headman = headman;
        this.student = student;
        this.tasks = tasks;
    }

    public void setNewHeadman(List<String> groupOfStudent){
       if (headman == null) {
           headman = new Student();
       }
   }

   public void addNewStudent(List<String> newStudent){
        if (student == null) {
            student = new ArrayList<>(1);
        }
   }
    public void deleteStudent(List<String> newStudent){
        if (student != null) {
            student = null;
        }
    }

    public void addNewTask(List<String> newTask){
        if (tasks == null) {
            tasks = new ArrayList<>();
        }
    }

    public void taskFinished(List<String> taskFinished){
        if (status == true) {
             System.out.println("Finished");
        }
    }

}

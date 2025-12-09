package src;

import java.util.List;
import src.TypeList;


public abstract class Students implements TypeList{
    private String name;
    private List<Course> Courses;
    private String id;
    private String program;  
    public static int totalStudents;
    public Students(String name, String id, String program) {
        this.name = name;
        this.id = id;
        this.program = program;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setProgram(String program) {
        this.program = program;
    }
    public static void setTotalStudents(int totalStudents) {
        Students.totalStudents = totalStudents;
    }
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public String getProgram() {
        return program;
    }
    public static int getTotalStudents() {
        return totalStudents;
    }

    public void addCourse(){

    }
    public void calculateGPA(){

    }
    public void displayResults(){

    }
    

    
}

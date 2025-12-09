import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import src.Course;
import src.Database;
import src.RecordList;
import src.Students;
import src.Transcript;


public class App{
    private RecordList<Students> studentsR;
    private RecordList<Transcript> transcriptsR;
    private RecordList<Course> coursesR;


    public App(){
        try {
            this.studentsR = new RecordList<>("students");
            this.coursesR = new RecordList<>("courses");
            this.transcriptsR = new RecordList<>("transcripts");

        } catch (Exception e) {
            System.err.println(e);
            return;
        }
    }
    void add(){
        
    }

    public static void main(String[] args) {
        try {
        } catch (Exception e) {
            System.err.println(e);
            return;
        }
    }
}

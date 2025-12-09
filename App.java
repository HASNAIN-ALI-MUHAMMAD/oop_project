import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import src.Database;
import src.RecordList;


public class App{
    public static void main(String[] args) {
        try {
            RecordList<Test> studentsR = new RecordList<>("students");
            RecordList<Test> resultsR = new RecordList<>("students");

        } catch (Exception e) {
            System.err.println(e);
            return;
        }
    }
}

class Test implements Serializable{
    String name;
    Test(String name){
        this.name = name;
    }
    @Override
    public String toString() {
        return this.name;
    }
}
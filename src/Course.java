package src;

import src.TypeList;

public class Course implements TypeList{
    private String courseCode;
    private String title;
    private float creditHours;
    private static int totalCourses;
    private CourseInstructor CourseInstructors;

    //Constructors
    public Course(String courseCode, String title, float creditHours) {
        this.courseCode = courseCode;
        this.title = title;
        this.creditHours = creditHours;
    }

    //Setters
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setCreditHours(float creditHours) {
        this.creditHours = creditHours;
    }
    public static void setTotalCourses(int totalCourses) {
        Course.totalCourses = totalCourses;
    }

    //Getters
    public String getId() {
        return courseCode;
    }
    public String getTitle() {
        return title;
    }
    public float getCreditHours() {
        return creditHours;
    }
    public static int getTotalCourses() {
        return totalCourses;
    }

    public void displayCourseDetails(){

    }
    

}

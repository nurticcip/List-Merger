import java.sql.SQLOutput;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int id;
    private String major;
    private int year;
    private final int maxCredit = 12;
    Course[] coursesList;

    public Student(String firstName, String lastName, int id, String major, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.major = major;
        this.year = year;
        this.coursesList = new Course[10];
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Course[] getCoursesList() {
        return coursesList;
    }

    public void setCoursesList(Course[] coursesList) {
        this.coursesList = coursesList;
    }
}


class Course{
    private String instructorName;
    private String courseName;
    private String courseID;
    private int maxStudentQuota;
    private int credits;
    Student[] studentsList;

    public Course(String instructorName, String courseName, String courseID, int maxStudentQuota, int credits) {
        this.instructorName = instructorName;
        this.courseName = courseName;
        this.courseID = courseID;
        this.maxStudentQuota = maxStudentQuota;
        this.credits = credits;
        studentsList = new Student[this.maxStudentQuota];
    }

    public void addStudent(Student s){
        if(s != null){
            for(int i=0; i<studentsList.length;i++){
                if(studentsList[i] == null){
                    studentsList[i] = s;
                    break;
                }
            }
        }
    }

    public void showEnrolledStudents(){
        for(int i=0; i<studentsList.length; i++){
            if(studentsList[i] != null){
                Student s = studentsList[i];
                System.out.println(s.getFirstName() + " " +
                        s.getLastName() + " "+
                        s.getMajor() + " "+
                        s.getYear() + " "+
                        s.getId());
            }
        }
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public int getMaxStudentQuota() {
        return maxStudentQuota;
    }

    public void setMaxStudentQuota(int maxStudentQuota) {
        this.maxStudentQuota = maxStudentQuota;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public Student[] getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(Student[] studentsList) {
        this.studentsList = studentsList;
    }
}

class University{
    static Student[] studentList= new Student[1000];
    static Course[] coursesList = new Course[20];
    public static void addStudent(Student student){
        for(int i=0; i<studentList.length; i++){
            if(studentList[i] == null){
                studentList[i] = student;break;
            }
        }
    }

    public static void addCourse(Course course){
        for(int i=0; i<coursesList.length; i++){
            if(coursesList[i] == null){
                coursesList[i] = course;break;
            }
            
        }
    }

    public static Course findCourse(String courseID){
        for(int i=0; i< coursesList.length; i++) {
            if(coursesList[i] != null) {
                if (coursesList[i].getCourseID().equals(courseID)){
                    System.out.println("Found course " + coursesList[i].getCourseName());
                    return coursesList[i];
                }

            }
        }
        return null;
    }

    public static void addStudentToCourse(int studentID, String courseID){
        //Find student
        Student s = null;
        for(int i=0;i<studentList.length;i++){
            if(studentList[i] != null){
                if(studentList[i].getId() == studentID){
                    s = studentList[i];
                    break;
                }
            }
        }


        //Add this student to the course
        for(int i=0; i< coursesList.length; i++){
            if(coursesList[i] != null){
                if(coursesList[i].getCourseID().equals(courseID)){
                    coursesList[i].addStudent(s);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = """
                1. Add a Student
                2. Add a Course
                3. Register a Student for a Course
                4. List All Courses a Student is Enrolled In
                5. List All Students in a Course
                6. Exit""";

        while (true){
            System.out.println(message);
            int option = scan.nextInt();
            scan.nextLine();

            switch (option){
                case 1:
                    Student s1 = new Student("Daniyal", "Va-Akhunov", 1, "CS", 1);
                    addStudent(s1);break;
                case 2:
                    //Course c1 = new Course();
                    addCourse(new Course("Emil", "Python",
                            "CS-PL", 60, 12));break;
                case 3: //Register a student for a course
                    System.out.println("Enter student id");
                    int s_id = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter course id");
                    String c_id = scan.nextLine();
                    addStudentToCourse(s_id, c_id);break;
                case 5:
                    System.out.println("Enter course id");
                    c_id = scan.nextLine();
                    Course c = findCourse(c_id);
                    if(c != null){
                        c.showEnrolledStudents();
                    }
                    break;
            }
        }
    }
}



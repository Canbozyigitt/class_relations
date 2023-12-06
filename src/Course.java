public class Course {
    private  String coursName;
    private String code;
    private Instructor instructor;

    public Course(String coursName,String code,Instructor instructor){
        this.coursName=coursName;
        this.code=code;
        this.instructor=instructor;

    }
    public String getCoursName(){
        return this.coursName;
    }
    public void setCoursName(String coursName){
        this.coursName=coursName;
    }
    public String getCode(){
        return this.code;

    }

    public void setCode(String code) {
        this.code = code;
    }
    public double calcAvarage(Student[] students){
        double avarage=0.0;
        for(int i=0; i<students.length;i++){
            avarage+=students[i].getNot();
        }
        return  avarage/students.length;
    }

    public Instructor getInstructor() {
        return this.instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
}

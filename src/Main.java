
public class Main {
    public static void main(String[] args) {
         Student st1=new Student("can","bozyiğit","123","ss",80);
         Student st2=new Student("umut","boz","456","cc",50);
         Student st3=new Student("patika","dev","789","dd",90);
         Instructor teacher=new Instructor("mahmut","çetindağ","ceng");
         Course mat=new Course("mat101","mat",teacher);
         System.out.println(mat.getInstructor().getName());





    }
}
public class Student {
    static String school_name="Alpha";//static variable
    String student_name;//instance variable
    public Student(String student_name) {
        this.student_name = student_name;
    }
    static void change(){    //static method for changing static variable
        school_name = "Sunbeam";
    }

    public void showStudentDetails() {
        System.out.println("  name: " + student_name + ", school: " + school_name);
    }

    public static void main(String[] args) {
        Student.change();//no object is needed for static method,we can call it by classname.method name itself
        Student s1 = new Student("uma");
        s1.showStudentDetails();

        Student s2= new Student("manju");
        s2.showStudentDetails();
    }
}

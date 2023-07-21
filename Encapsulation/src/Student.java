public class Student {
    private String name;
    private int age;
    private String major;

    // Constructor
    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // Method to display student information
    public void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Major: " + major);
    }

    // Main method to test the Student class
    public static void main(String[] args) {
        Student student = new Student("John Doe", 20, "Computer Science");
        student.displayInformation();

        student.setMajor("Electrical Engineering");
        student.setAge(21);
        student.displayInformation();
    }
}
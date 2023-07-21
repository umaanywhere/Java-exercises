public class ClassScheduler {

    public static void enrollStudents(String className, String... students) {
        System.out.println("Enrolling students for class: " + className);
        System.out.println("Students enrolled:");

        for (String student : students) {
            System.out.println(student);
        }

        System.out.println();
    }

    public static void main(String[] args) {
        enrollStudents("Mathematics", "Priya", "Catherine", "Anu");
        enrollStudents("Science", "Sarah", "David");
        enrollStudents("History"); // Enroll with no students
    }
}
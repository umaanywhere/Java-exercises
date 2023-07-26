public class SwitchExample1 {
    public static void main(String[] args) {
        char attendance='o';
        switch(attendance)
        {
            case 'p':
                System.out.println("Attended class");
                break;
            case 'o':
                System.out.println("On-Duty");
                break;
            case 'a':
                System.out.println("absent to class");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}

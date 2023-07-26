public class DoWhileExample1 {
    public static void main(String[] args) {
        int n=5;
        int sum=0;
        int i=1;
        do{
            sum+=i;//it executes atleast onetime the execution and after that it checks condition
            i++;
        }while(i==n);//since this condition is false it is executed only once and stopped
        System.out.println("sum:"+sum);

    }
}

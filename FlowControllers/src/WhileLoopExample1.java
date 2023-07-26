public class WhileLoopExample1 {
    public static void main(String[] args) {
        int n=5;
        int sum=0;
        int i=1;
        while(i<=n)
        {
            sum+=i;
            i++;//if it not given the loop will run for infinite times because i<=n is true for everytime i.e:1<=5
        }
        System.out.println("sum:"+sum);
    }
}

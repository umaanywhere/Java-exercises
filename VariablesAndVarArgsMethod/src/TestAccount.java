class User{
    int accno;
    String name;
    float amount;
    void insert(int a,String n,float amt)
    {
        accno=a;
        name=n;
        amount=amt;
    }
    void deposit(float amt)
    {
        amount=amount+amt;
        System.out.println(amt+" deposited");
    }
    void withdraw(float amt)
    {
        if(amount<amt)
        {
            System.out.println("Insufficient Balance");
        }
        else
        {
            amount=amount-amt;
            System.out.println(amt+" withdrawn");
        }
    }
    void checkBalance()
    {
        System.out.println("Balance is: "+amount);

    }
    void display()
    {
        System.out.println(accno+" "+name+" "+amount);

    }
}
class BankAccount
{
    public static void main(String[] args)
    {
        User a1=new User();
        a1.insert(414001498,"uma",10000);
        a1.display();
        a1.checkBalance();
        new User().deposit(40000);//through anonymous object
        //a1.deposit(40000);
        a1.checkBalance();
        a1.withdraw(15000);
        a1.checkBalance();
    }
}

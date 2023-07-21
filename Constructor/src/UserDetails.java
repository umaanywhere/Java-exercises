public class UserDetails {
    String name;
    int age;
    double salary;
    public UserDetails()//no-argument constructor
    {
        name="rajesh";
        age=25;
        salary=29000.565;
    }

    //constructor overloading
    public UserDetails(String name,int age,double salary)//parameterized constructor
    {
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    public UserDetails(UserDetails otherUser)//copy constructor
    {
      name=otherUser.name;
      age=otherUser.age;
      salary=otherUser.salary;
    }
    void display()
    {
        System.out.println("Name:"+name+" "+"Age:"+age+" "+"Salary:"+salary);
    }
    public static void main(String[] args)
    {
        UserDetails u1=new UserDetails();
        u1.display();
        UserDetails u2=new UserDetails("Anu",29,30000.876);
        u2.display();
        UserDetails u3=new UserDetails(u2);
        u3.display();

    }
}




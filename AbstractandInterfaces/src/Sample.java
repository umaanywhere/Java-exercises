 abstract class UserIdentity
{
    abstract void getName(String name);
    abstract void getGender(String gender);
    abstract void getCity(String city);
}
 class Person extends UserIdentity
{
    void getName(String name)
    {
        System.out.println("Name : " +name);
    }
    void getGender(String gender)
    {
        System.out.println("Gender : " +gender);
    }
    void getCity(String city)
    {
        System.out.println("City: " +city);
    }
    // Newly added method in subclass.
    void getCountry(String country)
    {
        System.out.println("Country: " +country);
    }
}
public class Sample
{
    public static void main(String[] args)
    {
// Declaring abstract class reference equal to subclass objects.
        UserIdentity u = new Person();
        u.getName("Uma");
        u.getGender("Female");
        u.getCity("Chennai");
        //u.getCountry("India"); // Compile-time error because we cannot access newly added method in subclass using superclass reference.
    }
}

class Language {
    private static Language language; // creating public static variable of class type
    private Language()  // private constructor
    {
        System.out.println("Inside Private Constructor");
    }
    public static Language getInstance() // public static method
    {
        if(language == null) // creating object if it's not created already
        {
            language = new Language();
        }
        return language;// returning the singleton object
    }
    public void display() {
        System.out.println("Singleton Pattern is achieved");
    }
}
class SingletonClass {
    public static void main(String[] args) {
        Language db1;
        db1= Language.getInstance();// calling getInstance method
        db1.display();
    }
}
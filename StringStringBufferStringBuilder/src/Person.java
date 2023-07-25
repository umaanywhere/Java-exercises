//Own Immutable Class Example
 final class Person {
    private  int age;
  Person(int age) {
        this.age = age;

    }
    public Person modifyAge( int age)
    {
      if(this.age == age)
      {
          return this;
      }
      else {
          return new Person (age);
      }
    }
    public static void main(String[] args) {
       Person p1=new Person(50);
       Person p2=p1.modifyAge(20);
       Person p3=p1.modifyAge(50);
        System.out.println(p1==p2);
        System.out.println(p1==p3);
    }

    }
package packet;

class A {
    int v = 8;
    String a = "happy morning";

    void reveal() {
        System.out.println("learning the default modifiers");
    }
}
class S{
    public static void main(String []args){
        A a2=new A();
        System.out.println(a2.v);
        System.out.println(a2.a);
        a2.reveal();
    }
}


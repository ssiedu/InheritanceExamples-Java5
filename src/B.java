
public class B extends A {

    public void f3() {
        System.out.println("goodbye");
    }

    public void f4() {
        System.out.println("seeyou");
    }

    public void messages() {
        f1();
        f2();
        f3();
        f4();
    }
    
    public static void main(String args[]){
        B ob=new B();
        ob.messages();
    }
    
    
}

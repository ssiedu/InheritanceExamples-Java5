public class B extends A {

    int n=200;
    
    public B(){
        System.out.println("Constructor of B");
    }
    
    public void show(){
        System.out.println("Welcome from B");
    }
    public void display(){
        super.show();
        //System.out.println(n);
        //System.out.println(super.n);
    }
    
    public static void main(String args[]){
        B ob=new B();
        //ob.display();
    }
    
    
}

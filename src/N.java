public class N extends M {
    void f3(){
        System.out.println("f3 of N");
    }
    void f4(){
        System.out.println("f4 of N");
    }
    
    public static void main(String args[]){
        //parent type reference can hold the object of
        //child class
        M ob=new N();
        ob.f1();
        ob.f2();
        ob.f3();
        ob.f4();
        
    }
}
/*
    M is parent class
    N is child class
*/
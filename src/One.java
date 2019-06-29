
public abstract class One {

    //concrete method
    void f1() {
        System.out.println("hello");
    }

    void f2() {
        System.out.println("welcome");
    }

    //abstract methods
    abstract void f3();

    abstract void f4();

    public static void main(String[] args) {
        System.out.println("Main of One (Abstract)");
    }

}

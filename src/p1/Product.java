package p1;

public class Product {
    public int publicMember=10;
    protected int protectedMember=20;
    int defaultMember=30;
    private int privateMember=40;
    
    public void show(){
        System.out.println(publicMember);
        System.out.println(protectedMember);
        System.out.println(defaultMember);
        System.out.println(privateMember);
    }
}

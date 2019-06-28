package p1;

public class NonChildWithinSamePkg {
    public void disp(){
        Product p=new Product();
        System.out.println(p.publicMember);
        System.out.println(p.protectedMember);
        System.out.println(p.defaultMember);
        //System.out.println(p.privateMember);
    }
}

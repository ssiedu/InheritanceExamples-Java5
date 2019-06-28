package p1;

public class ChildWithinSamePkg extends Product {
    public void test(){
        System.out.println(publicMember);
        System.out.println(protectedMember);
        System.out.println(defaultMember);
        //System.out.println(privateMember);
    }
}

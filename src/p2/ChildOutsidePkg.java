package p2;

import p1.Product;

public class ChildOutsidePkg  extends Product {
    public void test(){
        System.out.println(publicMember);
        System.out.println(protectedMember);
        //System.out.println(defaultMember);
        //System.out.println(privateMember);
    }
}

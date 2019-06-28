package p2;

import p1.Product;

public class NonChildOutsidePkg {
    public void demo(){
        Product p=new Product();
        System.out.println(p.publicMember);
        //System.out.println(p.protectedMember);
        //System.out.println(p.defaultMember);
        //System.out.println(p.privateMember);
    }
}

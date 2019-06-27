
public class Demo {

    private int x, y;

    public Demo(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public static void main(String[] args) {
        //here ref d1 is final
        //cant assign a new object
        final Demo d1=new Demo(10,20);
        System.out.println(d1.x+","+d1.y);
        
        d1.x=11;
        d1.y=21;
        System.out.println(d1.x+","+d1.y);
        
        //d1=new Demo(30,40);//error
        
        
        
    }
}

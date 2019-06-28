public class Y extends X {
    
    public Y(){
        super(1);
        System.out.println("Y-0-Args");
    }
    public Y(int a){
        super(1,2);
        System.out.println("Y-1-Args");
    }
    public Y(int a, int b){
        System.out.println("Y-2-Args");
    }
    public static void main(String args[]){
        Y ob=new Y(5);
    }
}

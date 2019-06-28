public class TEmp extends Emp {
    private int days;

    public TEmp(int eno, String ename, int days) {
        super(eno, ename);
        this.days = days;
    }
    
    public void info(){
        super.info();
        System.out.println(days);
    }
    
    public static void main(String args[]){
        TEmp e1=new TEmp(112,"BBB",90);
        e1.info();
    }
}

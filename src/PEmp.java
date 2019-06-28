public class PEmp extends Emp {
    
    private String desg;
    private int sal;
                    
    public PEmp(int eno, String ename, String desg, int sal){
        super(eno, ename);
        this.desg=desg;
        this.sal=sal;
    }
    public void info(){
        super.info();
        System.out.println(desg+","+sal);
    }
    public static void main(String args[]){
        
        PEmp e1=new PEmp(111,"AAA","Manager",50000);
        e1.info();
    }
    
}

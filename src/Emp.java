public class Emp {
    private int eno;
    private String ename;

    public Emp() {
    }

    public Emp(int eno, String ename) {
        this.eno = eno;
        this.ename = ename;
    }
    
    public void info(){
        System.out.println(eno+","+ename);
    }
    
}

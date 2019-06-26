public class EngStud extends Stud {
    
    private String branch;
    private int sem;
    
    //EngStud has overridden the info method of Stud
    public void info(){
        System.out.println("Information of EngStud");
    }
    public void setEData(String branch, int sem){
        this.branch=branch; this.sem=sem;
    }
    public void showEData(){
        System.out.println(branch+","+sem);
    }
}

public class EngStud extends Stud {
    
    private String branch;
    private int sem;
    
    
    public void setEData(String branch, int sem){
        this.branch=branch; this.sem=sem;
    }
    public void showEData(){
        System.out.println(branch+","+sem);
    }
}

public class MediStud extends Stud {
    private int prof;

    public void result(int per){
        if(per>=50){
            System.out.println("MediStud Passed With "+per);
        }else{
            System.out.println("MediStud Failed With "+per);
        }
    }
    public void setMData(int prof){
        this.prof=prof;
    }
    public void showMData(){
        System.out.println(prof);
    }
}

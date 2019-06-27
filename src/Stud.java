//public final class Stud{
public  class Stud{

    private int rno;
    private String name;
    private final int PASS_MARKS=33;

    public String toString(){
        String info="Info : ["+rno+","+name+"]";
        return info;
    }
    
    //public final void result(int per){
    public void result(int per){
        if(per>=PASS_MARKS){
            System.out.println("Student Passed With "+per);
        }else{
            System.out.println("Student Failed With "+per);
        }
    }
    
    public void setPData(int rno, String name) {
        this.rno = rno;
        this.name = name;
    }

    public void showPData() {
        System.out.println(rno + "," + name);
    }


}

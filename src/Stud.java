
public class Stud {

    private int rno;
    private String name;

    public void info(){
        System.out.println("XYZ Univ");
        System.out.println("Auto. Univ Ranked I");
        System.out.println("_______________________");
    }
    public void setPData(int rno, String name) {
        this.rno = rno;
        this.name = name;
    }

    public void showPData() {
        System.out.println(rno + "," + name);
    }


}

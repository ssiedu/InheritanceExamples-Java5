public abstract class Vehicle {
    private int power;
    public void setPower(int power){
        this.power=power;
    }
    public void showPower(){
        System.out.println("Power : "+power+" cc");
    }
    public abstract void start();
}

public abstract class Shape {
    
    private double radius;

    public final double getRadius() {
        return radius;
    }

    public final void setRadius(double radius) {
        this.radius = radius;
    }
    
    public void info(){
        System.out.println("Its A Shape");
    }
    public abstract void area();
}

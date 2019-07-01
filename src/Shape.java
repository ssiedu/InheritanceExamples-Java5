public abstract class Shape {
    
    private double radius;

    public abstract void area();
    
    public final double getRadius() {
        return radius;
    }

    public final void setRadius(double radius) {
        this.radius = radius;
    }
}

public class Circle extends Shape {
    
    public void area() {
        double r=getRadius();
        double area=3.14*r*r;
        System.out.println("Area of Circle : "+area);
    }
    
}

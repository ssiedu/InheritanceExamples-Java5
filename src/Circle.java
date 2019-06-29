public class Circle extends Shape {
    
    
    public void area() {
        double r=getRadius();
        double area=3.14*r*r;
        System.out.println("Area of Circle : "+area);
    }
    public static void main(String args[]){
        Shape s;    //declaring the reference
        
        /*
        Circle c=new Circle();
        c.info();
        c.setRadius(10);
        c.area();
        */
    }
}

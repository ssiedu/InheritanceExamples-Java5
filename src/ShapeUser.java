public class ShapeUser {

public static void showArea(Shape shape){
    shape.area();
}    
    
public static void main(String args[]){
    
    Circle circle=new Circle();
    circle.setRadius(10);
    
    Cylinder cylinder=new Cylinder();
    cylinder.setRadius(10);
    cylinder.setHeight(10);
    
    showArea(circle);
    showArea(cylinder);
    
}
    
}

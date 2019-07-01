public class Cylinder extends Shape {
    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    public void area(){
        double ar=2*3.14*getRadius()*height;
        System.out.println("Area of Cylinder : "+ar);
    }
    
}

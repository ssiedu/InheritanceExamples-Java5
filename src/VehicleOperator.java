public class VehicleOperator {

    public static void vehicleInfo(Vehicle vehicle){
        vehicle.showPower();
        vehicle.start();
    }
    
    public static void main(String args[]){
    
        Car car=new Car();
        car.setPower(1500);
        vehicleInfo(car);
        
        
        Bike bike=new Bike();
        bike.setPower(150);
        vehicleInfo(bike);
        
        //vehicleInfo(bike);
        /*
        car.showPower();
        car.start();
        
        bike.showPower();
        bike.start();
        */
        
    }
            
}

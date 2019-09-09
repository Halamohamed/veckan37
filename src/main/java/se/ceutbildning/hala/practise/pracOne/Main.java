package se.ceutbildning.hala.practise.pracOne;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[6];
        vehicles[0] = new Car(1,"volvo", "abc123");
        vehicles[1] = new Motor(2, "motor1", "abc124");
        vehicles[2] = new Truck(3, "truck1","abc125");
        vehicles[3] = new Car(4,"volvo2", "abc167");
        vehicles[4] = new Motor(5, "motor2", "abc1268");
        vehicles[5] = new Truck(6, "truck2","abc169");

        for (Vehicle vehicle: vehicles){
            if(vehicle instanceof Truck)
            vehicle.Drive();
        }
    }
}

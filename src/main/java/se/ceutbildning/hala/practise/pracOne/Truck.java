package se.ceutbildning.hala.practise.pracOne;

public class Truck extends Vehicle {


    public Truck(int id, String name, String rNumber) {
        super(id, name, rNumber);
    }

    @Override
    public void Drive() {
        System.out.println("Drive a truck");

    }

    public String toString(){
        return super.toString() + " a truck.";
    }
}

package se.ceutbildning.hala.practise.pracOne;

public class Car extends Vehicle {

    public Car(int id, String name, String rNumber){
        super(id,name, rNumber);
    }


    @Override
    public void Drive() {
        System.out.println(" Drive a car ");
    }
    public String toString(){
        return super.toString() + " a car .";
    }
}

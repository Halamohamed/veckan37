package se.ceutbildning.hala.practise.pracOne;

public class Motor extends Vehicle {


    public Motor(int id, String name, String rNumber) {
        super(id, name, rNumber);
    }

    @Override
    public void Drive() {
        System.out.println(" Drive a motor");

    }
    public String toString(){
        return super.toString() + " a motor .";
    }
}

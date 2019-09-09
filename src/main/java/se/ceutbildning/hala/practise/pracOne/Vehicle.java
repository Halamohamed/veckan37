package se.ceutbildning.hala.practise.pracOne;

public abstract class Vehicle {
    private int id;
    private String name;
    private String rNumber;

    public Vehicle(int id, String name, String rNumber) {
        this.id = id;
        this.name = name;
        this.rNumber = rNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getrNumber() {
        return rNumber;
    }

    public void setrNumber(String rNumber) {
        this.rNumber = rNumber;
    }
    public abstract void Drive();

    public String toString(){
        return " vehicle ";
    }

}

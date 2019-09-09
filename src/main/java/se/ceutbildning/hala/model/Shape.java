package se.ceutbildning.hala.model;

public abstract class Shape {
    protected  double base;
    protected double height;

    public Shape(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public abstract double getArea();

    public String toString(){
        return "Base = " + base + " Height = " + height;
    }
}

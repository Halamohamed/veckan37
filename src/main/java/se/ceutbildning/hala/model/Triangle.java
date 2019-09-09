package se.ceutbildning.hala.model;

public class Triangle extends Shape {


    public Triangle(double base, double height) {
        super(base, height);
    }

    @Override
    public double getArea() {
        return (base * height )/ 2;
    }
    public String toString(){
        return super.toString() + " Area of triangle is " + getArea();
    }

}

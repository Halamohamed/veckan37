package se.ceutbildning.hala.model;

public class Square extends Shape {

    private int foo;
    public Square(double base, double height){
        super(base, height);

    }

    @Override
    public double getArea() {
        return base * height;
    }

    public String toString(){
        return super.toString() + " Area of square is " + getArea();
    }
    public int getFoo(){
        return foo;
    }
}

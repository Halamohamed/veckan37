package se.ceutbildning.hala;

import se.ceutbildning.hala.model.Shape;
import se.ceutbildning.hala.model.Square;
import se.ceutbildning.hala.model.Triangle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Square(4,6);
        shapes[1] = new Triangle(4,6);
        shapes[2] = new Square(10,12);
        shapes[3] = new Triangle(2,8);
        shapes[4] = new Square(10,45);
        //shapes[5] = new Triangle(2,11);

        for (Object object : shapes){
            /*if (object instanceof Square){
                ((Square) object).getFoo();
            }*/
            System.out.println(object);
        }

    }
}

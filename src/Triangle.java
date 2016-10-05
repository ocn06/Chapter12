/**
 * Created by Olivi on 22-09-2016.
 */
public class Triangle {

    //Ex5
    /* Construct a triangle with the specified sides */
    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1) {
            throw new IllegalTriangleException();
        }
    }
}


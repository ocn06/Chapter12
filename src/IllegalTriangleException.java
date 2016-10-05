/**
 * Created by Olivi on 22-09-2016.
 */
public class IllegalTriangleException extends Exception{

    @Override
    public String toString() {
        return "the sum of any two sides must be\n" +
                "greater than the other side.";
    }
}

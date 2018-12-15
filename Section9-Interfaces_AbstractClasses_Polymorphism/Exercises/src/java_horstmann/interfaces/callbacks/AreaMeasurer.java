package java_horstmann.interfaces.callbacks;
import java.awt.Rectangle;

public class AreaMeasurer implements Measurer{

    public double measure(Object anObject) {
        Rectangle rectangle = (Rectangle) anObject;
        return rectangle.getHeight() * rectangle.getWidth();
    }

}

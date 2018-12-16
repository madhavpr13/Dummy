package java_horstmann.interfaces.innerclasses;

import java.awt.*;

public class MeasurerTester {


    public static void main(String[] args) {

        class AreaMeasurer implements Measurer {

            public double measure(Object anObject) {
                Rectangle rectangle = (Rectangle) anObject;
                return rectangle.getHeight() * rectangle.getWidth();
            }

        }

        class LengthMeasurer implements Measurer {

            @Override
            public double measure(Object anObject) {
                String aString = (String) anObject;
                return (double) aString.length();
            }
        }

        Measurer areaMeasurer = new AreaMeasurer();

        Rectangle[] rects = new Rectangle[]
                {
                        new Rectangle(5,10,20,30),
                        new Rectangle(10,20,30,40),
                        new Rectangle(20,30,5,15)
            };

        double averageArea = Data.average(rects, areaMeasurer);
        System.out.println("Average area of the rectangles is " + averageArea);

        Measurer lengthMeasurer = new LengthMeasurer();

        String[] strings = {"Hello", "World", "Scala", "Programming"};
        double averageLength = Data.average(strings, lengthMeasurer);
        System.out.println("Average length of the strings is " + averageLength);

        Rectangle r1 = new Rectangle(5,10,20,30);
        Rectangle r2 = new Rectangle(10,15,20,28);
        Rectangle max = (Rectangle) Data.maximum(r1, r2, areaMeasurer);
        System.out.println("The maximum rectangle has width " + max.getWidth() + ", and height " + max.getHeight());

    }


}

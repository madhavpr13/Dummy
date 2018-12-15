package java_horstmann.interfaces.callbacks;

public class LengthMeasurer implements Measurer {

    @Override
    public double measure(Object anObject) {
        String aString = (String) anObject;
        return (double) aString.length();
    }
}

package java_horstmann.interfaces.callbacks;

public class Data  {

    public static double average(Object[] objects, Measurer meas) {

        double sum = 0;
        for(Object obj : objects)
        {
            sum += meas.measure(obj);
        }

        return (objects.length > 0) ? (sum / objects.length) : 0;
    }

    public static Object maximum(Object a, Object b, Measurer meas) {

        return (meas.measure(a) > meas.measure(b)) ? a : b;
    }
}

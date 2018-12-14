package java_horstmann.interfaces;

public class Data {

    public static double average(Measurable[] objects) {
        double sum = 0;

        for(Measurable object : objects)
            sum += object.getMeasure();

        return (objects.length > 0) ? (sum / objects.length) : 0.0;

    }

    public static Measurable max(Measurable[] objects) {
        Measurable maxObject = objects[0];
        for(Measurable obj : objects)
            if(obj.getMeasure() > maxObject.getMeasure())
                maxObject = obj;

         return maxObject;
        }
    }


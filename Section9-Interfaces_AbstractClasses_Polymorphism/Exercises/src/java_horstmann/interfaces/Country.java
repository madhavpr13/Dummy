package java_horstmann.interfaces;

public class Country implements Measurable {

    public String name;
    public double area;

    public Country(String name, double area) {
        this.name = name;
        this.area = area;
    }

    @Override
    public double getMeasure() {
        return area;
    }

    public String getName() {
        return name;
    }

}

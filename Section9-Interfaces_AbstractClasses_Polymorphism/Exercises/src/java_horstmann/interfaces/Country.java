package java_horstmann.interfaces;

public class Country implements Measurable, Comparable{

    public String name;
    public double area;

    public Country(String name, double area) {
        this.name = name;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getMeasure() {
        return area;
    }

    @Override
    public int compareTo(Object o) {
        Country other = (Country) o;
        if(this.getMeasure() < other.getMeasure()) { return -1; }
        else if(this.getMeasure() == other.getMeasure()) { return 0; }
        else return 1;
    }

    @Override
    public String toString() {
        return "Country(Name:" + this.getName() + ", Area: " + this.getMeasure() + ")";
    }
}

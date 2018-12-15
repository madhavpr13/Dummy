package java_horstmann.interfaces.innerclasses.timbuchalka;

public class Main {

    public static void main(String[] args) {
        Gearbox mcLaren = new Gearbox(6);
        Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
        System.out.println(first.driveSpeed(1000));
        // This doesn't work -> Gearbox.Gear second = new Gear(2, 15.4);
        // This doesn't work too -> Gearbox.Gear third = new mcLaren.Gear(3, 17.8);

    }

}

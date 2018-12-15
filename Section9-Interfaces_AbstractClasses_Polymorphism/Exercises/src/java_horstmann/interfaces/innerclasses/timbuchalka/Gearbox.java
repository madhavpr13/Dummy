package java_horstmann.interfaces.innerclasses.timbuchalka;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    public int currentGear = 0;


    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
    }

    public class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;

            // to refer to the currentGear variable in the Gearbox class, use Gearbox.currentGear

        }

        public double driveSpeed(int revs) {
            return revs * ratio;
        }

    }


    // Instances of the Gear class have got access to all the methods and fields of the Outer class, even the private members.
}

package java_horstmann.interfaces.innerclasses.timbuchalka;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    public int currentGear = 0;
    private boolean clutchIsIn;


    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);

        for(int i = 1; i <=  maxGears; i++){
            addGear(i, i * 5.3);
        }
    }

    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio){
        if(number > 0 && number <= maxGears) {
            this.gears.add(new Gear(number,ratio));
        }
    }

    public void changeGear(int newGear) {
        if(newGear > 0 && newGear < gears.size() && clutchIsIn) {
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected");
        } else {
            System.out.println("Grindddddddd");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs) {
        if(clutchIsIn) {
            System.out.println("Screaaaammmmm");
            return 0.0;
        } else {

            return revs * gears.get(currentGear).getRatio();
        }
    }

    private class Gear {
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

        public double getRatio() {
            return ratio;
        }

    }


    // Instances of the Gear class have got access to all the methods and fields of the Outer class, even the private members.
}

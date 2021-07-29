package innerclass;

import java.util.ArrayList;

public class GearBox {
    private ArrayList<Gear> gears;
    private int maxGear;

    public GearBox(int maxGear) {
        this.maxGear = maxGear;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0, 0);
    }

    /*
          Sometime Gear class independently doest make any sense without Gear Box
          This is the reason for the inner class of GearBox.
          It can access private member of GearBox too
         It is coupled with GearBox
         */
    public class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

    }
}

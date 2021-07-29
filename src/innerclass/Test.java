package innerclass;

public class Test {

    public static void main(String dsa[]) {
        GearBox mcLearen = new GearBox(5);
        GearBox.Gear neutral = mcLearen.new Gear(0, 0);
        GearBox.Gear first = mcLearen.new Gear(1, 0);

        /*
          Here we cant indepedently create Gear like this ..
          GearBox.Gear first = new GearBox.Gear(1, 0);
         */


    }
}

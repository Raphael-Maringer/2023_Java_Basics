package at.ram.units.oo.examples.lamp;

import at.ram.units.oo.examples.cars.Helper;

public class Main {
    public static void main(String[] args) {

        LightElement le1 = new LightElement("Damien", "red", 8, LightElement.Status.on);
        LightElement le2 = new LightElement("Simon", "black", 4, LightElement.Status.off);
        LightElement le3 = new LightElement("David", "white", 3, LightElement.Status.on);

        Lamp l1 = new Lamp();

        l1.addLightElement(le1);
        l1.addLightElement(le2);
        l1.addLightElement(le3);

        l1.turnAllOn();
        System.out.println(Helper.format(l1.getOverallPowerUsage()));
        l1.printNamesOfLightElements();
    }
}

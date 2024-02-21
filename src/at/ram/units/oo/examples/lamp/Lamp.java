package at.ram.units.oo.examples.lamp;

import java.util.ArrayList;

public class Lamp {
    private ArrayList<LightElement> lightElements;

    public Lamp() {
        this.lightElements = new ArrayList<>();
    }

    public void addLightElement(LightElement lightElement) {
        lightElements.add(lightElement);
    }

    public void turnAllOn() {
        for (LightElement lightElement : lightElements) {
            lightElement.turnOn();
        }
    }

    public double getOverallPowerUsage() {
        double totalUsage = 0;
        for (LightElement lightElement : lightElements) {
            totalUsage += lightElement.getPowerConsumption();
        }
        double overallPowerUsage = totalUsage / this.lightElements.size();
        return overallPowerUsage;
    }

    public void printNamesOfLightElements() {
        for (int i = 0; i < lightElements.size(); i++) {
            LightElement lightElement = lightElements.get(i);
            System.out.println(lightElement.getName());
        }
    }
}
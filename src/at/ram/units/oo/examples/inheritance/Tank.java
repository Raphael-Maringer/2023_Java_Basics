package at.ram.units.oo.examples.inheritance;

public class Tank {
    private int tankVolume;
    private int fuelAmount;
    private int fuelConsumption;

    public Tank(int tankVolume, int fuelAmount, int fuelConsumption) {
        this.tankVolume = tankVolume;
        this.fuelAmount = fuelAmount;
        this.fuelConsumption = fuelConsumption;
    }



    public int getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }
}


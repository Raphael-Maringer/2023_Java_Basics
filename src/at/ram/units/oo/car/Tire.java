package at.ram.units.oo.car;

public class Tire {
    private int size;
    private String material;
    private boolean season;         // Sommer oder Winterreifen: Winterreifen = true, Sommerreifen = false

    public Tire(int size, String material, boolean season) {
        this.size = size;
        this.material = material;
        this.season = season;
    }

    public void changeSeason() {
        this.season = !this.season;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean getSeason() {
        return season;
    }

    public void setSeason(boolean season) {
        this.season = season;
    }
}

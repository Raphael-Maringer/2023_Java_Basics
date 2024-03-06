package at.ram.units.oo.examples.handy;

public class PhoneFile {
    private String extension;
    private int sizeInMB;
    private String name;

    public PhoneFile(String extension, int sizeInMB, String name) {
        this.extension = extension;
        this.sizeInMB = sizeInMB;
        this.name = name;
    }

    public String getInfo() {
        return name + "." + extension + "," + " Speicherbedarf: " + sizeInMB;
    }

    public String getExtension() {
        return extension;
    }

    public int getSizeInMB() {
        return sizeInMB;
    }

    public String getName() {
        return name;
    }
}

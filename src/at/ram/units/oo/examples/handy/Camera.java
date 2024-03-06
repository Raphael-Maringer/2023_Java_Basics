package at.ram.units.oo.examples.handy;

public class Camera {
    private int resolution;
    private int imageCount = 0;


    public Camera(int resolution) {
        this.resolution = resolution;
    }

    public PhoneFile makePicture() {
        int sizeInMB = resolution / 100 * 10;
        imageCount++;
        return new PhoneFile("img", sizeInMB, "photo" + imageCount);
    }
}

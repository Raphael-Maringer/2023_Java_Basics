package at.ram.units.oo.examples.handy;

public class Camera {
    private double resolution;
    private int imageCount = 0;

    public Camera(int resolution) {
        this.resolution = resolution;
    }

    public int getSizeInMB() {
        int size = (int) (resolution / 100 * 10);
        return size;
    }

    public PhoneFile makePicture() {
        imageCount++;
        return new PhoneFile("img", getSizeInMB(), "photo" + imageCount);
    }

    public double getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public int getImageCount() {
        return imageCount;
    }

    public void setImageCount(int imageCount) {
        this.imageCount = imageCount;
    }
}

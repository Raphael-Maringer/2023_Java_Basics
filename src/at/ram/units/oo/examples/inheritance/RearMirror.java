package at.ram.units.oo.examples.inheritance;

public class RearMirror {
    private int size;
    private int position;   // 0 neutral, -10 nach links, +10 nach rechts gerichtet

    public RearMirror(int size, int position) {
        this.size = size;
        this.position = position;
    }

    public void rotate() {
            position += 10 ;
        }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}

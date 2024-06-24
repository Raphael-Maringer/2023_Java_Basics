package at.ram.units.oo.examples.musicbox;

public class Title {
    private int duration;
    private String title;
    private String artist;
    private int Id;

    public Title(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getId() {
        return Id;
    }
}

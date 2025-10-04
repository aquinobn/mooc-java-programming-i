public class Song {
    private String name;
    private int length;

    public Song(String initialName, int inititalLength) {
        this.name = initialName;
        this.length = inititalLength;
    }

    public String name() {
        return this.name;
    }

    public int length() {
        return this.length;
    }
}

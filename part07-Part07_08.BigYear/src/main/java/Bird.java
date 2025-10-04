public class Bird {

    private String name;
    private String latinName;
    private int observation;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observation = 0;
    }

    public Bird(String name) {
        this.name = name;
        this.latinName = "";
        this.observation = 0;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getObservation() {
        return observation;
    }

    public String toString() {
        return "Name: " + name + "(" + latinName + "): " + observation + " observations";
    }

    public void incrementObservation() {
        this.observation++;
    }
}

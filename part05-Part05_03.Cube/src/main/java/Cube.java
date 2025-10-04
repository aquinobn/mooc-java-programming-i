public class Cube {

    private int edgeLenght;

    public Cube(int eL) {

        this.edgeLenght = eL;

    }

    public int getEdgeLenght() {
        return this.edgeLenght;
    }

    public int volume() {
        return this.edgeLenght * this.edgeLenght * this.edgeLenght;
    }

    public String toString() {
        return "The length of the edge is "+this.edgeLenght+" and the volume "+this.volume();
    }
    
}

public class Gauge {
    private int value = 0;

    public void increase() {
        if (value >= 5) {
            return;
        }
        this.value++;
    }
    
    public void decrease() {
        if (value <= 0) {
            return;
        }
        this.value--;
    }

    public int value() {
        return value;
    }

    public boolean full() {
        return (value == 5) ? true : false;
    }
}

public class Counter {

    private int counter;

    public Counter(int startValue) {
        this.counter = startValue;
    }

    public Counter() {
        this.counter = 0;
    }

    public int value() {
        return this.counter;
    }

    public void increase() {
        this.counter++;
    }

    public void decrease() {
        this.counter--;
    }

    public void increase(int increaseBy) {
        if (increaseBy < 0) {
            return;
        }
        this.counter += increaseBy;
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy < 0) {
            return;
        }
        this.counter -= decreaseBy;        
    }
    
}

public class Container {
    
    private int volume;

    public Container() {
        this.volume = 0;
    }

    public int contains() {
        return this.volume;
    }

    public void add(int amount) {
        if (amount <= 0) {
            return;
        }
        this.volume = (this.volume + amount > 100) ? 100 : (this.volume + amount);
    }

    public void remove(int amount) {
        if (amount <= 0){
            return;
        }
        this.volume = (this.volume - amount < 0) ? 0 : (this.volume - amount);            
    }

    public String toString() {
        return this.volume+"/100";
    }
}

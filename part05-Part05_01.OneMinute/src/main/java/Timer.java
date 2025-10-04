public class Timer {
    private ClockHand seconds;
    private ClockHand subseconds;    

    public String toString() {
        return String.valueOf(seconds)+":"+String.valueOf(subseconds);
    }

    public Timer() {
        this.seconds = new ClockHand(60);
        this.subseconds = new ClockHand(100);        
    }

    public void advance() {
        int start = this.subseconds.value();        
        this.subseconds.advance();
        int end = this.subseconds.value();        

        if (end < start) {
            this.seconds.advance();
        }        
    }

}

public class Fitbyte {
    private int restingHeartRate;
    private int age;

    public Fitbyte(int age, int restingHeartRate) {
        this.restingHeartRate = restingHeartRate;
        this.age = age;
    }

    public double targetHeartRate(double porcentageOfMaximum) {        
        if (porcentageOfMaximum < 0.0 || porcentageOfMaximum > 1) {
            return 0.0;
        }
        double maximumHeartRate = 206.3 - (0.711 * this.age);
        return ((maximumHeartRate - this.restingHeartRate) * (porcentageOfMaximum) + this.restingHeartRate);
    }
    
}

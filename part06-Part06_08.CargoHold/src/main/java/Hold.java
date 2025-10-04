import java.util.ArrayList;

public class Hold {
    
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= maxWeight) {
            suitcases.add(suitcase);
        }
    }

    public String toString() {
        return suitcases.size()+" suitcases ("+totalWeight()+" kg)";
    }

      public void printItems() {
        if (suitcases.isEmpty()) {
            return;
        }
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }

    private int totalWeight() {
        if (suitcases.isEmpty()) {
            return 0;
        }
        int totalWeight = 0;
        for (Suitcase suitcase : suitcases) {
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;
    }
}

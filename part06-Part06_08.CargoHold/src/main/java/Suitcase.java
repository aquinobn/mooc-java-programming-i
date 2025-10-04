import java.util.ArrayList;

public class Suitcase {

    private int maxWeight;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (getTotalWeight() + item.getWeight() <= maxWeight) {
            items.add(item);
        }
    }

    private int getTotalWeight() {
        if (items.isEmpty()) {
            return 0;
        }        
        int totalWeight = 0;
        for (Item item : items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }
    
    public String toString() {
        String cuantityWord = (items.size() == 0) ? "no" : String.valueOf(items.size());
        String itemWord = (items.size() == 1) ? "item" : "items";
        return cuantityWord+" "+itemWord+" ("+getTotalWeight()+" kg)";
    }

    public void printItems() {
        if (items.isEmpty()) {
            return;
        }
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }

    public int totalWeight() {
        if (items.isEmpty()) {
            return 0;
        }
        int totalWeight = 0;
        for (Item item : items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem () {
        if (items.isEmpty()) {
            return null;
        }
        Item aux = items.get(0);
        for (Item item : items) {
            if (item.getWeight() > aux.getWeight()) {
                aux = item;
            }
        }
        return aux;
    }
}

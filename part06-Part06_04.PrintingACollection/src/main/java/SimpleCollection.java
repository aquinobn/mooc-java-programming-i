
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection "+this.name+" is empty.";
        }

        String elementWord = (this.elements.size() == 1) ? "element" : "elements";        
        String header = "The collection "+this.name+" has "+this.elements.size()+" "+elementWord+":\n";

        StringBuilder elementsString = new StringBuilder();

        for (String element : elements) {
            elementsString.append(element);
            elementsString.append("\n");
        }
        
        if (elementsString.length() > 0) {
            elementsString.deleteCharAt(elementsString.length() - 1);
        }

        return header + elementsString.toString();
    }
    
}

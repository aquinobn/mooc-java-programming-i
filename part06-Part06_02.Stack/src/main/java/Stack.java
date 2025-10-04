
import java.util.ArrayList;

public class Stack {
    private ArrayList<String> list;

    public Stack() {
        this.list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    public void add(String value) {        
        this.list.add(value);
        
    }

    public ArrayList<String> values() {
        return this.list;
    }

    public String take(){
        if (this.list.isEmpty()) {
            return null;
        }
        int lastIndex = this.list.size() - 1;
        String element = this.list.get(lastIndex);
        this.list.remove(lastIndex);
        return element;
    }

}

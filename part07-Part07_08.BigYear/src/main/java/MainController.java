import java.util.ArrayList;

public class MainController {

    private ArrayList<Bird> db;

    public MainController () {        
        this.db = new ArrayList<>();
    }

    public boolean addBird(Bird bird) {
        if (bird == null) {
            return false;
        }
        db.add(bird);
        return true;
    }

    public boolean addObservation(String name) {
        if (name == null) {
            return false;
        }                     
        for (Bird bird : db) {
            if (bird.getName().equals(name)) {
                bird.incrementObservation();
                return true;
            }            
        }
        return false;
    }
    
    public String dbToString() {
        if (db.isEmpty()) {
            return "Error: No birds in database";
        }
        ArrayList<String> stringList = new ArrayList<>();
        for (Bird bird : db) {
            stringList.add(bird.toString());
        }
        return String.join("\n", stringList);
    }

    public String birdToString(String name) {
        if (db.isEmpty()) {
            return "Error: No birds in database";
        }        
        for (Bird bird : db) {
            if (bird.getName().equals(name)){
                return bird.toString();
            }
        }
        return "Not found";
    }
}

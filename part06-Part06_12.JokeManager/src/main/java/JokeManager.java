import java.util.ArrayList;
import java.util.Random;

public class JokeManager {

    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        if (joke.isEmpty()) {
            return;
        }
        jokes.add(joke);
    }

    public String drawJoke() {
        if (jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }
        int randomIndex = new Random().nextInt(jokes.size());

        return jokes.get(randomIndex);
    }

    public void printJokes() {
        if (jokes.isEmpty()) {
            System.out.println("No jokes");
        }
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }
}

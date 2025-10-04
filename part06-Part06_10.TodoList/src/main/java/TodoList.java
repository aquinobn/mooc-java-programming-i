import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void add(String task) {
        if (task == null) {
            return;
        }
        this.tasks.add(task);
    }

    public void print() {
        if (this.tasks.isEmpty()) {
            System.out.println("Empty TODO list.");
            return;
        }
        for (int i = 0; i < this.tasks.size(); i++) {
            System.out.println((i + 1) + ": " + this.tasks.get(i));
        }
    }

    public void remove(int number) {
        if (number <= 0 && number > this.tasks.size()) {
            System.out.println("Grong input");
            return;
        }
        this.tasks.remove(number - 1);
    }

    public boolean validTaskNumber(int number) {
        return (number - 1 < 0 || number - 1 > this.tasks.size()) ? false : true;         
    }
}

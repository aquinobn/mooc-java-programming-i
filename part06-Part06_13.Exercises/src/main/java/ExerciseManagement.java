import java.util.ArrayList;

public class ExerciseManagement {

    private ArrayList<Exercise> exercises;

    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }

    public ArrayList<Exercise> exerciseList() {
        return this.exercises;
    }

    public void add(String exercise) {
        this.exercises.add(new Exercise(exercise));
    }

    public void markAsCompleted(String exercise) {
        for (Exercise exe : exercises) {
            if (exe.getName().equals(exercise)) {
                exe.setCompleted(true);
            }
        }
    }
    
    public boolean isCompleted(String exercise) {
        for (Exercise exe : exercises) {
            if (exe.getName().equals(exercise)) {
                return exe.isCompleted();
            }
        }
        return false;
    }
}

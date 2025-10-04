import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ExerciseManagementTest {

    private ExerciseManagement management;

    @Before
    public void initialize() {
        this.management = new ExerciseManagement();
    }

    @Test
    public void exerciseListEmptyAtBeginning() {
        assertEquals(0, management.exerciseList().size());
    }

    @Test
    public void addingExerciseGrowsListByOne() {
        management.add("Here goes nothing"); // Agrego una tarea
        assertEquals(1, management.exerciseList().size()); // Verifico que haya una agregada
    }

    @Test
    public void addedExerciseIsInList() {
        management.add("Here goes nothing"); // Agrego una tarea
        boolean found = false;
        for (Exercise e : management.exerciseList()) {
            if (e.getName().equals("Here goes nothing")) {
                found = true;
                break;
            }
        }
        assertTrue(found);
    }

    @Test
    public void exerciseCanBeMarkedCompleted() {
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        assertTrue(management.isCompleted("New exercise"));
    }

    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        assertFalse(management.isCompleted("Some exercise"));
    }

}

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class ExerciseManagementTest {
    
    private ExerciseManagement management;
    
    @Before
    public void initialize() {
        management = new ExerciseManagement();
    }
    
    @Test
    public void exerciseListEmptyAtBeginning() {
        assertEquals(0, management.exerciseList().size());
    }
    
    @Test
    public void addingExerciseGrowsListByOne() {
        management.add("NEW");
        assertEquals(1, management.exerciseList().size());
    }
    
    @Test 
    public void exerciseIsInTheList() {
        management.add("NEW");
        assertTrue(management.exerciseList().contains("NEW"));
    }
    
    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        management.add("NEW");
        management.markAsCompleted("NEW");
        assertTrue(management.isCompleted("NEW"));
    }
    
    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {
        management.add("NEW");
        assertFalse(management.isCompleted("NEW"));
    }

}

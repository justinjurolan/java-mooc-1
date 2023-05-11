
import java.util.ArrayList;

public class ExerciseManagement {
    private ArrayList<Exercise> exercises;
    
    public ExerciseManagement () {
        this.exercises = new ArrayList<>();
    }
    
    public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();
        
        for (Exercise e : this.exercises) {
            list.add(e.getName());
        }
        
        return list;
    }
    
    public void add(String name) {
        this.exercises.add(new Exercise(name));
    }
    
    public void markAsCompleted(String exercises) {
        for (Exercise e : this.exercises) {
            if (e.getName().equals(exercises)) {
                e.setCompleted(true);
            }
        }
    }
    
    public boolean isCompleted(String exercises) {
        for (Exercise e : this.exercises) {
            if (e.getName().equals(exercises)) {
                return e.isCompleted();
            }
        }
        return false;
    }
}

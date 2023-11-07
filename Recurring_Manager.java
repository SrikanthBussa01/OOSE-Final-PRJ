import java.util.ArrayList; 
import java.util.List;      
public class Recurring_Manager {
    private List<Task> _recurringTasks = new ArrayList<Task>(); // Use ArrayList
    public List<Task> _manages = new ArrayList<Task>(); // Use ArrayList

    public void generateTasks() {
        // Add logic to generate recurring tasks
    }

    public void addTask(Task task) {
        // Add a task to the recurring manager
        _manages.add(task);
    }

    public void removeTask(Task task) {
        // Remove a task from the recurring manager
        _manages.remove(task);
    }
}
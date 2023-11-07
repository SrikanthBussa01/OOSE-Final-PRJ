import java.util.ArrayList;
import java.util.List;

public class Category {
    private String _id;
    private String _name;
    public Task _belongs_To;
    public List<Task> _contains = new ArrayList<Task>(); // Use ArrayList

    public void addTask(Task task) {
        // Add a task to the category
        _contains.add(task);
    }

    public void removeTask(Task task) {
        // Remove a task from the category
        _contains.remove(task);
    }
}
import java.util.Date; 

public class User extends Task {
    private int _userId;
    private String _userName;

    public void createTask(String title, String description, Date dueDate) {
        // Create a new task with the provided details
        _title = title;
        _description = description;
        _dueDate = dueDate;
    }
}
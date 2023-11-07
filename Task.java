
import java.util.Date;  

public class Task {
    private int _userId;
    private String _title;
    private String _description;
    private enum _todo_ongoing_completed_ _status;
    private Date _dueDate;
    private boolean _isRecurring;
    private String _recurringInterval;
    public Recurring_Manager _manages;
    public Category _belongs_To;
    public Category _contains;

    public void markAsTodo() {
        // Set the task status to "Todo"
        _status = _todo_ongoing_completed_.todo;
    }

    public void markAsOngoing() {
        // Set the task status to "Ongoing"
        _status = _todo_ongoing_completed_.ongoing;
    }

    public void markAsCompleted() {
        // Set the task status to "Completed"
        _status = _todo_ongoing_completed_.completed;
    }

    public void scheduleTask(Date dueDate) {
        // Set the due date for the task
        _dueDate = dueDate;
    }

    public void setRecurring(boolean recurring, String interval) {
        // Set the recurring flag and interval for the task
        _isRecurring = recurring;
        _recurringInterval = interval;
    }
}
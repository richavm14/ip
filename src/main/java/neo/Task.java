package neo;

/**
 * Task class.
 */
public class Task {
    protected String description;
    protected Boolean isDone = false;
    protected Boolean hasPriority = false;
    protected String priority;

    /**
     * Constructor for task class.
     *
     * @param description user input text
     */
    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    /**
     * Returns description of task.
     *
     * @return String
     */
    public String getTask() {
        return description;
    }

    /**
     * Returns X if task has been completed.
     *
     * @return String
     */
    public String getIsDone(){
        return (isDone ? "X" : " ");
    }

    /**
     * Marks task as done.
     *
     * @param done True if task is completed.
     */
    public void setIsDone(Boolean done){
        isDone = done;
    }

    public void setPriority(String command) {
        this.hasPriority = true;
        this.priority = command;
    }

    /**
     * Returns task in a specific format.
     *
     * @return String
     */
    @Override
    public String toString() {
        if (hasPriority) {
            return "[" + getIsDone() + "] " + description + " priority: " + priority;
        }
        return "[" + getIsDone() + "] " + description;
    }
}


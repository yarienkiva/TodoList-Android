package com.example.todo_dsc_mdl;

public class Task {
    private String taskName;
    private String taskDescription;
    private String taskDate;
    private String taskDuration;
    private String taskLabel;
    private String taskLocalisation;
    private boolean taskCompleted;

    public Task(String taskName, String taskDescription, String taskDate,
                    String taskDuration, String taskLabel, String taskLocalisation) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskDate = taskDate;
        this.taskDuration = taskDuration;
        this.taskLabel = taskLabel;
        this.taskLocalisation = taskLocalisation;
        this.taskCompleted = false;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    //TODO(alois): return String, conversion epoch -> date
    public String getTaskDate() {
        return taskDate;
    }

    //TODO(alois): return String, conversion temps -> minutes
    public String getTaskDuration() {
        return taskDuration;
    }

    public String getTaskLabel() {
        return taskLabel;
    }

    public String getTaskLocalisation() {
        return taskLocalisation;
    }

    public boolean isTaskCompleted() { return taskCompleted; }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public void setTaskDate(String taskDate) {
        this.taskDate = taskDate;
    }

    public void setTaskDuration(String taskDuration) {
        this.taskDuration = taskDuration;
    }

    public void setTaskLabel(String taskLabel) {
        this.taskLabel = taskLabel;
    }

    public void setTaskLocalisation(String taskLocalisation) {
        this.taskLocalisation = taskLocalisation;
    }

    public void setTaskCompleted(boolean taskCompleted) {
        this.taskCompleted = taskCompleted;
    }
}

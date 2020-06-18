package com.workshop.starterapp.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Task")
public class Task {

    @PrimaryKey(autoGenerate = true)
    private int taskPriority;

    @ColumnInfo(name = "taskName")
    private String taskName;

    @ColumnInfo(name = "taskDescription")
    private String taskDescription;

    public Task(String taskName, String tastDescription, int taskPriority) {
        this.taskPriority = taskPriority;
        this.taskName = taskName;
        this.taskDescription = tastDescription;
    }

    public Task() {
    }

    public int getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(int taskPriority) {
        this.taskPriority = taskPriority;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String tastDescription) {
        this.taskDescription = tastDescription;
    }
}

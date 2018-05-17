package com.kodilla.hibernate.tasklist;

import com.kodilla.hibernate.task.Task;

import java.util.List;

public final class TaskList {
    private int id;
    private List<Task> listName;
    private String description;

    public TaskList(int id, List<Task> listName, String description) {
        this.id = id;
        this.listName = listName;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public List<Task> getListName() {
        return listName;
    }

    public String getDescription() {
        return description;
    }
}

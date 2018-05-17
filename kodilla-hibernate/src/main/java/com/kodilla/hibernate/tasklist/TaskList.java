package com.kodilla.hibernate.tasklist;

import com.kodilla.hibernate.task.Task;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "TASKLISTS")
public final class TaskList {
    private int id;
    private List<Task> listName;
    private String description;

    public TaskList() {
    }

    public TaskList(int id, List<Task> listName, String description) {
        this.id = id;
        this.listName = listName;
        this.description = description;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "LISTNAME")
    public List<Task> getListName() {
        return listName;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setListName(List<Task> listName) {
        this.listName = listName;
    }

    private void setDescription(String description) {
        this.description = description;
    }
}

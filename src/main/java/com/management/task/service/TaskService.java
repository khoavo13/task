package com.management.task.service;

import com.management.task.entity.Task;

import java.util.List;
import java.util.Optional;

public interface TaskService {
    List<Task> getAllTasks();

    Task createTask(Task task);

    Optional<Task> getTaskById(Long id);

    Task updateTask(Long id, Task updatedTask);

    void deleteTask(Long id);
}

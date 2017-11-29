package io.github.christiandraeger.tasks.service;

import io.github.christiandraeger.tasks.domain.Task;
import io.github.christiandraeger.tasks.repositiory.TaskRepository;

public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> list() {
        return taskRepository.findAll();
    }
}

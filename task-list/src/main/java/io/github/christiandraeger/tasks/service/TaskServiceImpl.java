package io.github.christiandraeger.tasks.service;

import org.springframework.stereotype.Service;

import io.github.christiandraeger.tasks.domain.Task;
import io.github.christiandraeger.tasks.repositiory.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> list() {
        return taskRepository.findAll();
    }

    @Override
    public Task save(Task task) {
        return taskRepository.save(task);
    }
}

package io.github.christiandraeger.tasks.service;

import io.github.christiandraeger.tasks.domain.Task;

public interface TaskService {

    Iterable<Task> list();
}
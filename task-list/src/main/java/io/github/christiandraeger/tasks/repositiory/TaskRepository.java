package io.github.christiandraeger.tasks.repositiory;

import org.springframework.data.repository.CrudRepository;

import io.github.christiandraeger.tasks.domain.Task;

public interface TaskRepository extends CrudRepository<Task, Long> {

}

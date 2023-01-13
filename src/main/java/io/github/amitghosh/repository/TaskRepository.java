package io.github.amitghosh.repository;

import io.github.amitghosh.model.entity.common.TaskStatus;
import io.github.amitghosh.model.entity.db.Project;
import io.github.amitghosh.model.entity.db.Task;
import io.github.amitghosh.model.entity.db.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Amit Ghosh
 */
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findAllByAssignedUser(User user);

    List<Task> findAllByProject(Project project);

    List<Task> findAllByDueDateBefore(LocalDate today);

    List<Task> findAllByStatus(TaskStatus status);
}

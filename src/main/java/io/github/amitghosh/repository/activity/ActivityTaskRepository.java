package io.github.amitghosh.repository.activity;

import io.github.amitghosh.model.entity.activity.ActivityTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Amit Ghosh
 */
@Repository
public interface ActivityTaskRepository extends JpaRepository<ActivityTask, Long> {
}

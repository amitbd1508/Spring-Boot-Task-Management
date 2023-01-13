package io.github.amitghosh.repository.activity;

import io.github.amitghosh.model.entity.activity.ActivityProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Amit Ghosh
 */
@Repository
public interface ActivityProjectRepository extends JpaRepository<ActivityProject, Long> {
}

package io.github.amitghosh.repository;

import io.github.amitghosh.model.entity.db.Project;
import io.github.amitghosh.model.entity.db.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Amit Ghosh
 */
@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    List<Project> findAllByAssignedUser(User user);

    List<Project> findAllByCreatedBy(String username);
}

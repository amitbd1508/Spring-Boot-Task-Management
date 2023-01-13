package io.github.amitghosh.repository;

import io.github.amitghosh.model.entity.db.UserRoles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Amit Ghosh
 */
@Repository
public interface UserRolesRepository extends JpaRepository<UserRoles, Long> {
}

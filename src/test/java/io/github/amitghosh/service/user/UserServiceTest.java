package io.github.amitghosh.service.user;

import io.github.amitghosh.DidacticJourneyApplication;
import io.github.amitghosh.model.entity.common.Status;
import io.github.amitghosh.model.entity.db.User;
import io.github.amitghosh.model.entity.db.UserRoles;
import io.github.amitghosh.model.request.UserCreateRequest;
import io.github.amitghosh.repository.UserRolesRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ActiveProfiles;

import java.time.LocalDateTime;

/**
 * @author Amit Ghosh
 */
@Slf4j
@SpringBootTest(classes = DidacticJourneyApplication.class)
@ActiveProfiles("dev")
class UserServiceTest {

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRolesRepository userRolesRepository;

    @Test
    @Disabled
    void createUser() {
        UserCreateRequest userCreateRequest = new UserCreateRequest();
        userCreateRequest.setUsername("admin");
        userCreateRequest.setPassword("admin1");
        userCreateRequest.setEmail("admin@amitghosh.com");
        userCreateRequest.setFirstName("Amit");
        userCreateRequest.setLastName("Ghosh");
        userCreateRequest.setStatus(Status.ACTIVE);

        User adminUser = userService.createUser(userCreateRequest, "System");
        log.debug("user: {}", adminUser);
        Assertions.assertNotNull(adminUser);

        UserRoles userRoles = new UserRoles();
        userRoles.setUserId(adminUser.getId());
        userRoles.setRoleId(1L);
        userRoles.setRoleName("ADMIN");
        userRoles.setCreateTime(LocalDateTime.now());
        userRoles.setCreatedBy("System");

        UserRoles savedUserRoles = userRolesRepository.save(userRoles);
        log.debug("roles of user: {}", savedUserRoles);
        Assertions.assertNotNull(savedUserRoles);
    }
}

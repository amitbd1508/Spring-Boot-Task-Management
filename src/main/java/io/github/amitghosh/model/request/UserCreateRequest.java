package io.github.amitghosh.model.request;

import io.github.amitghosh.model.entity.common.Status;
import lombok.Data;

/**
 * @author Amit Ghosh
 */
@Data
public class UserCreateRequest {
    private String username;

    private String password;

    private String email;

    private String firstName;

    private String LastName;

    private Status status;
}

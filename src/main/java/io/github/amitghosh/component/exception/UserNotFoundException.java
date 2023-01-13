package io.github.amitghosh.component.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Amit Ghosh
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}

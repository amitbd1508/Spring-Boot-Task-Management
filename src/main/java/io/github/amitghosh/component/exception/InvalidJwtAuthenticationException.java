package io.github.amitghosh.component.exception;

import org.springframework.security.core.AuthenticationException;

/**
 * @author Amit Ghosh
 */
public class InvalidJwtAuthenticationException extends AuthenticationException {
    public InvalidJwtAuthenticationException(String msg, Exception ex) {
        super(msg, ex);
    }
}

package io.github.amitghosh.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author Amit Ghosh
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthRequest implements Serializable {
    @NotBlank(message = "error.auth.username.blank")
    private String username;

    @NotBlank(message = "error.auth.password.blank")
    private String password;
}

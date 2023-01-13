package io.github.amitghosh.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Amit Ghosh
 */
@Data
@ConfigurationProperties(prefix = "security.jwt.token")
public class JwtConfigProperties {
    private String secretKey;
    private Long accessExpire;
    private Long refreshExpire;
}

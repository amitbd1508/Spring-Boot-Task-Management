package io.github.amitghosh.model.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * @author Amit Ghosh
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SuccessDetails<T> {

    private T data;

    private String message;

    private String template;

    private String redirect;

    public SuccessDetails() {
    }

    public SuccessDetails(T data) {
        this.data = data;
    }

    public SuccessDetails(String template, String redirect) {
        this.template = template;
        this.redirect = redirect;
    }
}

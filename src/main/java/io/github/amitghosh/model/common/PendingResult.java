package io.github.amitghosh.model.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * @author Amit Ghosh
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PendingResult {

    private static final int FACTOR = 1000;

    private String url;

    private int interval;

    public PendingResult() {
    }

    public PendingResult(String url, int interval) {
        this.url = url;
        this.interval = interval * FACTOR;
    }
}

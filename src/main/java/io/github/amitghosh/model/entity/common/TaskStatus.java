package io.github.amitghosh.model.entity.common;

import io.github.amitghosh.component.exception.ValidationException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.util.Arrays;
import java.util.Optional;

/**
 * @author Amit Ghosh
 */
@Getter
@AllArgsConstructor
public enum TaskStatus {
    OPEN("open"),
    IN_PROGRESS("in progress"),
    CLOSED("closed");

    String value;

    public static TaskStatus getStatus(String status) {
        Optional<TaskStatus> optTaskStatus = Arrays.stream(TaskStatus.values())
                .filter(v -> v.getValue().equals(status))
                .findFirst();

        return optTaskStatus.orElseThrow(() ->
                new ValidationException(HttpStatus.BAD_REQUEST, "status", "invalid.task.status"));
    }
}

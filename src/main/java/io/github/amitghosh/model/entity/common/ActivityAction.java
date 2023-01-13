package io.github.amitghosh.model.entity.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Amit Ghosh
 */
@Getter
@AllArgsConstructor
public enum ActivityAction {
    INSERT(0),
    UPDATE(1),
    DELETE(2);

    private final int action;
}

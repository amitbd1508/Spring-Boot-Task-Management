package io.github.amitghosh.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.amitghosh.model.dto.ProjectModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Amit Ghosh
 */
@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProjectDeleteResponse {
    private String message;

    private ProjectModel project;
}

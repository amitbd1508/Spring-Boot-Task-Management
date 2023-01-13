package io.github.amitghosh.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.amitghosh.model.dto.TaskModel;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Amit Ghosh
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TaskResponse {
    private List<TaskModel> tasks;

    private TaskModel task;

    public static TaskResponse of(List<TaskModel> tasks) {
        TaskResponse response = new TaskResponse();
        response.setTasks(tasks);
        return response;
    }

    public static TaskResponse of(TaskModel task) {
        TaskResponse response = new TaskResponse();
        response.setTask(task);
        return response;
    }
}

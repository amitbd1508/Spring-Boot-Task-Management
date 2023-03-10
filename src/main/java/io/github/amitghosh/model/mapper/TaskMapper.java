package io.github.amitghosh.model.mapper;

import io.github.amitghosh.model.dto.TaskModel;
import io.github.amitghosh.model.entity.common.TaskStatus;
import io.github.amitghosh.model.entity.db.Project;
import io.github.amitghosh.model.entity.db.Task;
import io.github.amitghosh.model.entity.db.User;
import io.github.amitghosh.model.request.TaskCreateRequest;
import io.github.amitghosh.model.request.TaskEditRequest;

/**
 * @author Amit Ghosh
 */
public class TaskMapper {

    public static TaskModel mapper(Task entity) {
        TaskModel model = new TaskModel();
        model.setId(entity.getId());
        model.setDescription(entity.getDescription());
        model.setStatus(entity.getStatus());
        model.setProject(ProjectMapper.mapperForInternal(entity.getProject()));
        model.setAssignedUser(UserMapper.mapperForInternal(entity.getAssignedUser()));
        model.setDueDate(entity.getDueDate());
        return model;
    }

    public static Task createRequestToEntity(TaskCreateRequest taskCreateRequest, String createdBy, Project project, User user) {
        Task entity = new Task();

        entity.setDescription(taskCreateRequest.getDescription());
        entity.setStatus(TaskStatus.getStatus(taskCreateRequest.getStatus()));
        entity.setProject(project);
        entity.setAssignedUser(user);
        entity.setDueDate(taskCreateRequest.getDueDate());

        entity.setCreatedBy(createdBy);
        return entity;
    }

    public static void updateRequestToEntity(Task entity, TaskEditRequest taskEditRequest, String createdBy, Project project, User user) {

        if (taskEditRequest.getDescription() != null) {
            entity.setDescription(taskEditRequest.getDescription());
        }
        if (taskEditRequest.getStatus() != null) {
            entity.setStatus(TaskStatus.getStatus(taskEditRequest.getStatus()));
        }
        if (project != null) {
            entity.setProject(project);
        }
        if (user != null) {
            entity.setAssignedUser(user);
        }
        if (taskEditRequest.getDueDate() != null) {
            entity.setDueDate(taskEditRequest.getDueDate());
        }
        entity.setCreatedBy(createdBy);
    }
}

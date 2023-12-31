package com.mediaworkbench.workbench.dto.usertask;

import java.time.LocalDateTime;

public record UserTaskResponse(
        Long id,
        LocalDateTime assignmentDate,
        String userName,           // Name of the user to whom the task is assigned
        String userSurname,        // Surname of the user to whom the task is assigned
        String taskName,           // Include task's name
        String userTaskStatus      // Updated to represent status as a string
) {}

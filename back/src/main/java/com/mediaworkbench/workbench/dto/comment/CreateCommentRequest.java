package com.mediaworkbench.workbench.dto.comment;

import java.time.LocalDateTime;

public record CreateCommentRequest(
        String text,
        LocalDateTime timestamp,
        Long userId,
        Long taskId
) { }

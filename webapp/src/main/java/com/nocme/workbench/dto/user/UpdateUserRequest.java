package com.nocme.workbench.dto.user;

public record UpdateUserRequest(
        Long id,
        String name,
        String surname,
        String email,
        String password,
        Boolean isAdmin
) { }
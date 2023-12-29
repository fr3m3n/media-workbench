package com.mediaworkbench.workbench.service;

import com.mediaworkbench.workbench.dto.user.*;

import java.util.List;

public interface IUserService {

    void insertUser(CreateUserRequest createUserRequest);
    List<UserResponse> selectAllUser();
    UserResponse selectUserByID(Long id);
    void updateUserByID(UpdateUserRequest updateUserRequest);
    void deleteUserByID(Long id);

    LoginUserResponse login(LoginUserRequest loginUserRequest);
}

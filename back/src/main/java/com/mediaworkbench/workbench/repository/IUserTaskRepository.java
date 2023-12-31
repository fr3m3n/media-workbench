package com.mediaworkbench.workbench.repository;

import com.mediaworkbench.workbench.model.UserTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserTaskRepository extends JpaRepository <UserTask, Long> {
    List<UserTask> findByTaskId(Long taskId);

}

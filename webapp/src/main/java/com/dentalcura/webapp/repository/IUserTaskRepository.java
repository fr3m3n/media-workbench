package com.dentalcura.webapp.repository;

import com.dentalcura.webapp.model.UserTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserTaskRepository extends JpaRepository <UserTask, Long> {
}
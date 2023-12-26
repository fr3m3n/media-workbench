package com.dentalcura.webapp.repository;

import com.dentalcura.webapp.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITaskRepository extends JpaRepository <Task, Long> {
}

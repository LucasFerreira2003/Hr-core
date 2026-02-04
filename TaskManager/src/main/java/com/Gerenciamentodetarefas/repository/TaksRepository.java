package com.Gerenciamentodetarefas.repository;

import com.Gerenciamentodetarefas.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaksController extends JpaRepository<Task, Long> {
    List<Task> findByStatus(String status);
}

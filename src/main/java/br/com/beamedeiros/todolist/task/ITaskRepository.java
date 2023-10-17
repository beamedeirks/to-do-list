package br.com.beamedeiros.todolist.task;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ITaskRepository extends JpaRepository< TaskModel, UUID> {
  //criação de metodos
  List<TaskModel> findByIdUser(UUID idUser);
  TaskModel findByIdAndIdUser(UUID id, UUID idUser);
}

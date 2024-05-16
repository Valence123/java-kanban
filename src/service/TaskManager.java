package service;

import model.Epic;
import model.Task;
import model.TaskStatus;
import model.Subtask;

import java.util.*;

public interface TaskManager {

    List<Task> getAllTasks();
    List<Epic> getAllEpics();
    List<Subtask> getAllSubTasks();

    Task createTask(Task task);
    Epic createEpic(Epic epic);
    Subtask createSubTask(Subtask subTask);

    Task getTask(int id);
    Epic getEpic(int id);
    Subtask getSubTask(int id);

    void updateTask(Task task);
    void updateEpic(Epic epic);
    void updateSubTask(Subtask subTask);

    void deleteTaskById(int id);
    void deleteEpicById(int id);
    void deleteSubTaskById(int id);

    void deleteAllTasks();
    void deleteAllEpics();
    void deleteAllSubTasks();

    List<Subtask> getEpicSubtasks(int epicId);
    List<Task> getHistory();
}

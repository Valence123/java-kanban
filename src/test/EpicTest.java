package test;

import model.Epic;
import model.Subtask;
import model.TaskStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EpicTest {

    @Test
    void testAddSubTask() {
        Epic epic = new Epic(1, "Epic Task");
        Subtask subTask1 = new Subtask(2, "Sub Task 1", 1);
        Subtask subTask2 = new Subtask(3, "Sub Task 2", 1);
        subTask1.setStatus(TaskStatus.DONE);
        subTask2.setStatus(TaskStatus.NEW);

        epic.addSubTask(subTask1);
        epic.addSubTask(subTask2);

        assertEquals(2, epic.getSubTasks().size());
        assertEquals(TaskStatus.IN_PROGRESS, epic.getStatus());
    }

    @Test
    void testCalculateStatus() {
        Epic epic = new Epic(1, "Epic Task");
        Subtask subTask1 = new Subtask(2, "Sub Task 1", 1);
        Subtask subTask2 = new Subtask(3, "Sub Task 2", 1);

        subTask1.setStatus(TaskStatus.DONE);
        subTask2.setStatus(TaskStatus.DONE);
        epic.addSubTask(subTask1);
        epic.addSubTask(subTask2);

        assertEquals(TaskStatus.DONE, epic.calculateStatus());
    }

    @Test
    void testRemoveSubTask() {
        Epic epic = new Epic(1, "Epic Task");
        Subtask subTask1 = new Subtask(2, "Sub Task 1", 1);
        epic.addSubTask(subTask1);
        assertEquals(1, epic.getSubTasks().size());

        epic.removeSubTask(subTask1);
        assertEquals(0, epic.getSubTasks().size());
        assertEquals(TaskStatus.NEW, epic.getStatus());
    }
}
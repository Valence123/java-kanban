package test;
import model.Subtask;
import model.TaskStatus;
import model.Epic;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SubtaskTest {
    private Subtask subtask;
    private Epic epic;

    @BeforeEach
    public void setUp() {
        subtask = new Subtask(1, "SubTask Test", 10);
        epic = new Epic(2, "Epic Test");
    }

    @Test
    public void testConstructor() {
        assertEquals(1, subtask.getId());
        assertEquals("SubTask Test", subtask.getName());
        assertEquals(TaskStatus.NEW, subtask.getStatus());
        assertEquals(10, subtask.getEpicId());
    }

    @Test
    public void testGetEpicId() {

        assertEquals(10, subtask.getEpicId());
    }

    @Test
    public void testSetEpic() {
        subtask.setEpic(epic);
        assertEquals(2, subtask.getEpicId());
    }
}


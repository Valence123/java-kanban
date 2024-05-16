package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import model.*;
import service.*;

class InMemoryHistoryManagerTest {
    @Test
    void shouldAddTaskToHistory() {
        HistoryManager historyManager = new InMemoryHistoryManager();
        Task task = new Task(1, "Test Task");
        historyManager.add(task);
        assertFalse(historyManager.getHistory().isEmpty());
        assertEquals(task, historyManager.getHistory().getFirst());
    }

    @Test
    void shouldRemoveTaskFromHistory() {
        HistoryManager historyManager = new InMemoryHistoryManager();
        Task task = new Task(1, "Test Task");
        historyManager.add(task);
        historyManager.remove(1);
        assertTrue(historyManager.getHistory().isEmpty());
    }
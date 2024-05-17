package service;

import model.Task;
import java.util.LinkedList;


public class InMemoryHistoryManager implements HistoryManager {
    private static final int MAX_HISTORY_SIZE = 10;
    private final LinkedList<Task> history = new LinkedList<>();

    @Override
    public LinkedList<Task> getHistory() {

        return new LinkedList<>(history);
    }

    @Override
    public void add(Task task) {
        if (task == null) {
            throw new IllegalArgumentException("Task cannot be null");
        }
        if (history.size() == MAX_HISTORY_SIZE) {
            history.removeFirst();
        }
        history.add(task);
    }

    @Override
    public void remove(int id) {

        history.removeIf(t -> t.getId() == id);
    }
}

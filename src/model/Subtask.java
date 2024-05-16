package model;

public class Subtask extends Task {
    private int epicId;

    public Subtask(int id, String name, int epicId) {
        super(id, name);
        this.status = TaskStatus.NEW;
        this.epicId = epicId;
    }

    public int getEpicId() {

        return epicId;
    }

    public void setEpic(Epic epic) {
        if (this.id == epic.getId()) {
            throw new IllegalArgumentException("A subtask cannot be its own epic");
        }
        this.epicId = epic.getId();
    }
}
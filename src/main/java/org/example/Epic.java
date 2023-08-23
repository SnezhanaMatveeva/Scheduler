package org.example;

public class Epic extends Task {
    protected String[] subtask;

    public Epic(int id, String[] subtask) {
        super(id);
        this.subtask = subtask;
    }

    public String[] getSubtask() {
        return subtask;
    }


    @Override
    public boolean matches(String query) {
        for (int i = 0; i < subtask.length; i++) {
            if (subtask[i].equals(query)) {
                return true;
            }
        }
        return false;
    }
}













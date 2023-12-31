import org.example.Epic;
import org.example.Meeting;
import org.example.SimpleTask;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TaskTest {

    @Test
    public void matchesTestReturnsTrueWhenQuerySimpleTask() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        String query = "Позвонить";
        boolean expected = true;
        boolean actual = simpleTask.matches(query);
        assertEquals(expected, actual);
    }

    @Test
    public void matchesTestReturnsFalseWhenQuerySimpleTask() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        String query = "Написать";
        boolean expected = false;
        boolean actual = simpleTask.matches(query);
        assertEquals(expected, actual);
    }

    @Test
    public void matchesTestReturnsTrueWhenQueryEpic(){
        String[] subtask = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtask);
        String query = "Хлеб";
        boolean expected = true;
        boolean actual = epic.matches(query);
        assertEquals(expected, actual);

    }

    @Test
    public void matchesTestReturnsFalseWhenQueryEpic(){
        String[] subtask= {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtask);
        String query = "Кофе";
        boolean expected = false;
        boolean actual = epic.matches(query);
        assertEquals(expected, actual);
    }

    @Test
    public void matchesTestReturnsTrueWhenQueryMeetingTopic() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        String query = "Выкатка";
        boolean expected = true;
        boolean actual = meeting.matches(query);
        assertEquals(expected, actual);
    }

    @Test
    public void matchesTestReturnsFalseWhenQueryMeetingTopic() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        String query = "Презентация";
        boolean expected = false;
        boolean actual = meeting.matches(query);
        assertEquals(expected, actual);
    }

    @Test
    public void matchesTestReturnsTrueWhenQueryMeetingProject() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        String query = "Приложение";
        boolean expected = true;
        boolean actual = meeting.matches(query);
        assertEquals(expected, actual);
    }

    @Test
    public void matchesTestReturnsFalseWhenQueryMeetingProject() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        String query = "Программа";
        boolean expected = false;
        boolean actual = meeting.matches(query);
        assertEquals(expected, actual);
    }

}

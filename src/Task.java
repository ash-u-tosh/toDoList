import java.time.LocalDate;

public class Task {
    int id;
    String task;
    LocalDate date;
    static int new_id = 1;

    boolean isCompleted;

    public Task(String newTask){
        id = new_id;
        new_id++;

        date = LocalDate.now();

        task = newTask;

        isCompleted = false;
    }
}

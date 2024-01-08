import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Choices {

    void showTasks(ArrayList<Task> tasks)
    {
        for(Task t : tasks){
            System.out.println(t.id + ": " + t.task);
        }
    }

    void groupByDate(ArrayList<Task> tasks)
    {
        System.out.println("Enter date in yyyy-mm-dd format : ");
        Scanner sc = new Scanner(System.in);
        String d = sc.nextLine();

        LocalDate date = LocalDate.parse(d);

        for(Task t : tasks)
        {
            if(t.date.isEqual(date))
            {
                System.out.println(t.task);
            }
        }
    }

    void addTask(ArrayList<Task> tasks)
    {
        System.out.print("Enter task to be added : ");

        Scanner sc = new Scanner(System.in);
        String newTask = sc.nextLine();

        Task nTask = new Task(newTask);
        tasks.add(nTask);
    }

    void deleteTask(ArrayList<Task> tasks)
    {
        showTasks(tasks);
        System.out.println("Enter task id to be deleted : ");

        Scanner sc = new Scanner(System.in);
        int did = sc.nextInt();

        tasks.removeIf(t->t.id == did);

        System.out.println("Task deleted !!!");
    }

    void markCompleted(ArrayList<Task> tasks)
    {
        System.out.println("Enter task id to mark completed : ");
        Scanner sc = new Scanner(System.in);
        int cid = sc.nextInt();

        for(Task t : tasks)
        {
            if(t.id == cid)
            {
                t.isCompleted = true;
                break;
            }
        }
    }

    void startsWith(ArrayList<Task> tasks)
    {
        System.out.println("Enter word to search tasks that start with : ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        for(Task t : tasks)
        {
            if(t.task.startsWith(word))
                System.out.println(t.task);
        }
    }
}

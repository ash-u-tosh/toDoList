import java.util.*;

public class Main {
    public static void main(String[] args) {

        Choices c = new Choices();
        ArrayList<Task> tasks = new ArrayList<>();

        while(true)
        {
            System.out.println("Select options - ");
            System.out.println("1. Add task.");
            System.out.println("2. Retrieve all tasks grouped by date.");
            System.out.println("3. Delete task.");
            System.out.println("4. Mark a task as completed.");
            System.out.println("5. Search tasks that start with a particular word.");
            System.out.println("6. Show tasks.");
            System.out.println("7 Quit.");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            if(choice == 1)
                c.addTask(tasks);
            else if(choice == 2)
                c.groupByDate(tasks);
            else if(choice == 3)
                c.deleteTask(tasks);
            else if (choice == 4)
                c.markCompleted(tasks);
            else if (choice == 5)
                c.startsWith(tasks);
            else if (choice == 6)
                c.showTasks(tasks);
            else if (choice == 7)
                break;
        }

    }
}





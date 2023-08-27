package Clase7;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private List<String> tasklist;

    public TaskManager() { tasklist = new ArrayList<>();}

    public void addTask (String task){tasklist.add(task);}

    public void removeTask (int index){tasklist.remove(index);}

    public void markAsCompleted (int index){
        String completed = "[COMPLETED]"+ tasklist.get(index);
        tasklist.set(index,completed);
    }
    public void printTasklist(){
        System.out.println("Lista de tareas: ");
        int taskNumber = 1;
        for (String task:tasklist){
            System.out.println(taskNumber + ". " + task);
            taskNumber++;
        }
    }
}

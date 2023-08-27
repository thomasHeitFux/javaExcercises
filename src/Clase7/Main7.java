package Clase7;

public class Main7 {
    public static void main7(){
    TaskManager taskManager = new TaskManager();

        taskManager.addTask("Completar lección 7");
        taskManager.addTask("Hacer las compras");
        taskManager.addTask("Revisar el canal de slack");
        taskManager.addTask("Prepararme para el code review!");

        taskManager.markAsCompleted(0);

        taskManager.removeTask(2);

        taskManager.printTasklist();
    }
}

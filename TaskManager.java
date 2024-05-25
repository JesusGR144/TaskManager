
public class TaskManager{
    private List<Task> taskList;

    TaskManager(){
        this.listaTareas = new ArrayList<>();
    }

    //Metodo para agregar tareas
    public void RegisterTask(Task task){
        listaTareas.add(tarea);
    }

    //Metodo para eliminar pelicula por id
    public void DeleteTask(String name){
        taskList.removeIf(t -> p.getName() == name);
    }

    //Metodo para mostrar tareas pendientes por prioridad
    public PendingTask(){
        taskList.stream()
                .filter(task -> !task.isCompleted())
                .sorted(Comparator.comparing(Task::getPriority))
                .forEach(task -> System.out.println(task.getName() + " - " + task.getDescription() + " - " + task.getPriority()));
    }

    //Metodo para marcar tareas como completadas
    public void CompletedTask(){
        for (Task task : taskList) {
            if (task.getName().equals(name)) {
                task.setCompleted(true);
                break;
            }
        }
    }
}
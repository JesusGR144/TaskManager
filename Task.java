class Task{
    private String name, description;
    private Prioritys priority;  
    private boolean completed;
    
    public Task(String name, String description, Priority priority){
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.completed = false;
    }

    //Getters y Setters
    public String getName(){
        return name;
    }

    public String getDescription89{
        return description;
    }

    public String getPriority(){
        return priority;
    }

    public boolean isCompleted(){
        return completed;
    }

    public void setName(String Name){
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setPriority(String priority){
        this.priority = priority;
    }    
}
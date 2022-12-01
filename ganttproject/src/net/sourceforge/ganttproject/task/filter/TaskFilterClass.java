
/**
 * @author
 * @author
 * @author
 * @author
 * @author Sofia Monteiro 60766
 */
package net.sourceforge.ganttproject.task.filter;

import java.util.ArrayList;
import java.util.List;
import net.sourceforge.ganttproject.task.Task;
import net.sourceforge.ganttproject.task.TaskNode;

public class TaskFilterClass implements TaskFilter{

    private TaskNode currRoot;


    public TaskFilterClass(){
    }

    private boolean isValid(Task task){
        //System.out.println(task.getName());
        return task.getName().equals("tarefa_0") || task.getName().equals("tarefa_2");
    }

    @Override
    public List<Task> getFilteredTasks(List<Task> tasks){
        List<Task> finalTasks = new ArrayList<Task>();
        for(Task currTask : tasks){
            if(isValid(currTask)) {
                finalTasks.add(currTask);
                //System.out.println("Está apurada");
            }
        }
        return  finalTasks;
    }

    @Override
    public TaskNode getFilteredTasksAsNode(TaskNode root){
        currRoot = root;
        processNode(root);
        return currRoot;
    }

    private void processNode(TaskNode root){
        if(root == null){
            return;
        }
        //System.out.println(root.getUserObject().getClass().getName());
        Task currTask =(Task) root.getUserObject();
        //System.out.println(currTask.getClass().getName());

        int childNum = root.getChildCount();
        for(int i = 0; i<childNum;i++){
            processNode((TaskNode) root.getChildAt(i));
        }

        if(!isValid(currTask) && !currTask.getName().equals("root")){
            System.out.println("Node retirado da task: " + currTask.getName());
            currRoot.remove(root);
        }
        else{
            System.out.println("Node nao retirado: " + currTask.getName());
        }

    }



}
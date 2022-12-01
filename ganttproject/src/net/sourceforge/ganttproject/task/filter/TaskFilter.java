/**
 * @author
 * @author
 * @author
 * @author
 * @author Sofia Monteiro 60766
 */

/**
 * Used to know of a certain task is selected, according to the filters decided
 * by the user.
 */
package net.sourceforge.ganttproject.task.filter;
import net.sourceforge.ganttproject.task.Task;
import java.util.List;
import java.util.Set;
import net.sourceforge.ganttproject.task.TaskNode;
public interface TaskFilter {

    List<Task> getFilteredTasks(List<Task> tasks);

    TaskNode getFilteredTasksAsNode(TaskNode root);

    Set<Task> getNotFiltredTasks(Set<Task> hTasks,List<Task> task);

}
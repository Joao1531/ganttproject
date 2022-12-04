package net.sourceforge.ganttproject.task.alerts;

import biz.ganttproject.core.time.GanttCalendar;
import java.util.Date;
import net.sourceforge.ganttproject.task.TaskImpl;

public class AlertImpl implements Alert{
    private static int ONE_DAY_IN_MILISECONDS = 24 * 60 * 60 * 1000;
    private Date warningDate;

/**
Considering that java util Date uses miliseconds, when we create an alert, we want its date to be
1 day before the "end day" of the task
 */
    public AlertImpl(Date endDateOftask) {
        //this.warningDate = new Date (endDateOftask - ONE_DAY_IN_MILISECONDS);
    }

    /**
     * function that will pop up JFrame with the message when we reach the date of the alarm
     */
    /*public popUpAlert trigger(){
        return new popUpAlert();
    }*/
}
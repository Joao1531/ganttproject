package net.sourceforge.ganttproject.resource.filter;
/**
 * @author David Moreira 59984
 * @author Joana Maroco 60052
 * @author João Lopes 60055
 * @author José Romano 59241
 * @author Sofia Monteiro 60766
 *
 */

import java.util.List;

import net.sourceforge.ganttproject.resource.HumanResource;
/**
 *This interface is implemented on HumanResourceFilterImpl
 * Is used to filter Human Resources verifying if their name has
 *  the substring the user is looking for
 */
public interface HumanResourceFilter{

    /**
     * Filters the list
     *
     * @param hrList list to be filtred
     * @return the filtered list
     */
    List<HumanResource> filterHumanResourceList(List<HumanResource> hrList);

    /**
     * Returns if the Human Resource maches the substring
     *
     * @param hr Human Resource to verify
     * @return if has the substring the user is looking for
     */
    boolean isValid(HumanResource hr);

    /**
     * This method changes the used filter
     *
     * @param newFilter - the new filter
     */
    void changeFilter(String newFilter);


}
package net.sourceforge.ganttproject.resource.filter;
/**
 * @author
 * @author
 * @author
 * @author
 * @author Sofia Monteiro 60766
 *
 */

import java.util.List;

import net.sourceforge.ganttproject.resource.HumanResource;

public interface HumanResourceFilter{

    List<HumanResource> filterHumanResourceList(List<HumanResource> hrList);

    boolean isValid(HumanResource hr);




}
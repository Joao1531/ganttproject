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
import java.util.ArrayList;
import java.util.Iterator;

import net.sourceforge.ganttproject.resource.HumanResource;

/**
 *This class filter Human Resources verifying if their name has
 *  the substring the user is looking for*
 */

public class HumanResourceFilterImpl implements HumanResourceFilter{

    private String toFilter;

    public HumanResourceFilterImpl(){
        this.toFilter = "";
    }

    /**
     * Returns if the Human Resource maches the substring
     *
     * @param hr Human Resource to verify
     * @return if has the substring the user is looking for
     */
    @Override
    public boolean isValid(HumanResource hr){
        return hr.getName().contains(toFilter);
    }

    /**
     * Filters the list
     *
     * @param hrList list to be filtred
     * @return the filtered list
     */
    public List<HumanResource> filterHumanResourceList(List<HumanResource> hrList){
        List<HumanResource> resList = new ArrayList<HumanResource>();
        Iterator<HumanResource> it = hrList.iterator();
        while(it.hasNext()){
            HumanResource hr = it.next();
            if(isValid(hr)){
                resList.add(hr);
            }
            System.out.println(hr.getName());
        }
        return resList;
    }

}
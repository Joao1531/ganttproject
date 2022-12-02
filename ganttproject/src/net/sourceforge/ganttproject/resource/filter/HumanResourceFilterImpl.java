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
import java.util.ArrayList;
import java.util.Iterator;

import net.sourceforge.ganttproject.resource.HumanResource;

public class HumanResourceFilterImpl implements HumanResourceFilter{

    public HumanResourceFilterImpl(){

    }

    @Override
    public boolean isValid(HumanResource hr){
        return hr.getName().equals("lol1");
    }

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
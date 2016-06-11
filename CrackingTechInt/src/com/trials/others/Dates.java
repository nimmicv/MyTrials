package com.trials.others;

import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

public class Dates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Date());
		//eCalender cal = new Calendar();
		String line = "/hix/entity/locateassister/entitydetail/103/109?entityName=&language=&zipCode=83702&distance=5";
		if(line != null) {
		    String[] st = line.split("\\?");
		    if(st.length>0)
		    {
		    	//vars.put("URL",st[0]);
		    }
		    System.out.println(st[0]);
		   
		        //String varname = vars.get("vName") + "_subj_" + i;
		        //vars.put(varname,st[1]);
		    
	}
		
	}
}



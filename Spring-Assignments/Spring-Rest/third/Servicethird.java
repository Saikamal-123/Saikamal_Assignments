package com.rest.third;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Servicethird {
	
	List<Details> list=new ArrayList<>(Arrays.asList(
			new Details("telangana","hyderabad","India",50151),
			new Details("michigan","cleveland","usa",50145),
			new Details("london","birmingham","england",52545),
			new Details("sydney","waca","australia",50145)
			));
	public Details getDetails(Integer id)
	{
		return list.stream().filter(t->t.getZip().equals(id)).findFirst().get();
	
   }
	

}

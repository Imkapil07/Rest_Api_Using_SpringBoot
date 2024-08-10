package com.rest.RestApi;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Data {

	List<String> list;
	
	public List<String> data(){
		list = new ArrayList<>();
		list.add("Kapil");
		list.add("Sachin");
		list.add("Bhoal");
		list.add("Krishna");
		return list;
	}
	public List<String> Insertdata(String data){
		list = new ArrayList<>();
		list.add("Kapil");
		list.add("Sachin");
		list.add("Bhoal");
		list.add("Krishna");
		list.add(data);
		return list;
	}
	
}

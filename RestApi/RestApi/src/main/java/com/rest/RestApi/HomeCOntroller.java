package com.rest.RestApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeCOntroller {
  

	@Autowired
	Data data;
	
	@RequestMapping("/demo11")
	public List<String> show() {
		String str = data.data().remove(1);
		System.out.println(str);
		return data.data();
	}
	
	@RequestMapping("/demo22/{name}")
	public List<String> insert(@PathVariable(name = "name") String name) {
//		data.Insertdata(name);
		System.out.println(name);
		return data.Insertdata(name);
	}
	
}

package in.rest02;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeContoller {

	@GetMapping("/hii")
	public String home() {
		return "Hello World";
	}
	
	@GetMapping("/ipl")
	public String[] ipl() {
		String[] str = {"RCB","RR","MI","GT","CSK","KKR"};
		return str;
	}
	
	@GetMapping("/teams")
	public ArrayList<IplTeams> iplTeams() {
		ArrayList<IplTeams> list = new ArrayList<IplTeams>();
		IplTeams iplteams = new IplTeams("RCB",0,"Pta nahi","Virat Kohli");
		IplTeams iplteams1 = new IplTeams("RCB",0,"Pta nahi","Virat Kohli");
		IplTeams iplteams2 = new IplTeams("RCB",0,"Pta nahi","Virat Kohli");
		IplTeams iplteams3 = new IplTeams("RCB",0,"Pta nahi","Virat Kohli");
		IplTeams iplteams4 = new IplTeams("RCB",0,"Pta nahi","Virat Kohli");
		
		list.add(iplteams);
		list.add(iplteams1);
		list.add(iplteams2);
		list.add(iplteams3);
		list.add(iplteams4);
		
		return list;
	}
	
	@GetMapping("/team/{team}")
	public ArrayList<IplTeams> findTeam(@PathVariable String team) {
		ArrayList<IplTeams> list = new ArrayList<IplTeams>();
		
		if(team.equals("RCB"))
		    list.add(new IplTeams("RCB",0,"Pta nahi","Virat Kohli"));
		else if(team.equals("MI"))
			list.add(new IplTeams("MI",0,"Pta nahi","Virat Kohli"));
		else
			list.add(new IplTeams("RR",0,"Pta nahi","Virat Kohli"));
		
		return list;
	}
	
	
}

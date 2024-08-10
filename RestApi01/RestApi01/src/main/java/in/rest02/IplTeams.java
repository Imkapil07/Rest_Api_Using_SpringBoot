package in.rest02;

public class IplTeams {

	String name ;
	
	int trophy;
	
	String owner;
	
	String captain;
	
	public IplTeams(String name, int trophy, String owner, String captain) {
		super();
		this.name = name;
		this.trophy = trophy;
		this.owner = owner;
		this.captain = captain;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTrophy() {
		return trophy;
	}

	public void setTrophy(int trophy) {
		this.trophy = trophy;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getCaptain() {
		return captain;
	}

	public void setCaptain(String captain) {
		this.captain = captain;
	}

	@Override
	public String toString() {
		return "IplTeams [name=" + name + ", trophy=" + trophy + ", owner=" + owner + ", captain=" + captain + "]";
	}
	
	
}

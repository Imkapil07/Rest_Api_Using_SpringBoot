package in.kp.entity;

public class Course {

	private long id;
	private String title;
	private String disc;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(long id, String title, String disc) {
		super();
		this.id = id;
		this.title = title;
		this.disc = disc;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDisc() {
		return disc;
	}

	public void setDisc(String disc) {
		this.disc = disc;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", disc=" + disc + "]";
	} 
	
	
	
}

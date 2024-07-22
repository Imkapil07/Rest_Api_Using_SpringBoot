package in.kp.service;

import java.util.List;

import in.kp.entity.Course;

public interface courseService {

	public List<Course> getCourse();
	
	public Course getCour(long courseId); 
	
	public Course addCourse(Course course);
	
	public void deleteCourse(long courseId);
	
	public Course updateCourse(Course course);
	
}

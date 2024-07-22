package in.kp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.kp.entity.Course;
import in.kp.service.courseService;

@RestController
public class MyController {

	@Autowired
	private courseService cs;

	@GetMapping("/home")
	public String home() {
		return "My Home";
	}

	@GetMapping("/courses")
	public List<Course> getCourses() {
		return this.cs.getCourse();
	}

	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.cs.getCour(Long.parseLong(courseId));
	}

	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		return this.cs.addCourse(course);
	}

	@DeleteMapping("/courses/{courseId}")
	public void deleteCourse(@PathVariable String courseId) {
		this.cs.deleteCourse(Long.parseLong(courseId));
	}

	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course) {
		return this.cs.updateCourse(course);
	}

}

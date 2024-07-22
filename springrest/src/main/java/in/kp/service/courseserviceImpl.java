package in.kp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import in.kp.entity.Course;

@Service
public class courseserviceImpl implements courseService {

	List<Course> list;
	
	public courseserviceImpl() {
		
		list = new ArrayList<>();
		list.add(new Course(1,"Java 8","This is a Java 8 Book for freshers"));
		list.add(new Course(2,"Python","This is a Python Book for freshers"));
	}

	@Override
	public List<Course> getCourse() {
		return list;
	}

	@Override
	public Course getCour(long courseId) {
		Course c = null;
		for(Course cr : list) {
			if(cr.getId() == courseId) {
				c = cr;
				break;
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

	@Override
	public void deleteCourse(long courseId) {
		    for (Course cours : list) {
		        if (cours.getId() == courseId) {
		            list.remove(cours);
		            break;
		        }
		    }
	}

	@Override
	public Course updateCourse(Course course) {
        for (Course co : list) {
            if (course.getId() == co.getId()) {
                course.setTitle(co.getTitle());
                course.setDisc(co.getDisc());
                return course;
            }
        }
        return null;

	} 

}

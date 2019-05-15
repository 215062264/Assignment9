package ac.za.cput.service;


import ac.za.cput.domain.schoolSubjects.Course;
import java.util.Set;

public interface CourseService extends IService<Course, String> {

    Set<Course> getAllAppDevCourses();
    Set<Course> getAll();
}

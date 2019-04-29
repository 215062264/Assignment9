package ac.za.cput.Factory;

import ac.za.cput.Domain.Course;

public class CourseFactory {

    public static Course getCourse(String courseName, String courseID) {
        return new Course.Builder()
                .courseId(courseID)
                .courseName(courseName)
                .build();
    }

}

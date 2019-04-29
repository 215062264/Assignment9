package ac.za.cput.factoryTest;

import ac.za.cput.Domain.Course;
import ac.za.cput.Factory.CourseFactory;
import org.junit.Assert;
import org.junit.Test;

public class CourseFactoryTest {

    @Test
    public void getCourse() {

        String name = "Diploma in Information & Communication Technology";
        String id = "DIP ICT";

        Course c = CourseFactory.getCourse(name,id);
        System.out.println(c);
        Assert.assertNotNull(c.getCourseId()+"\n"+c.getCourseName());
    }

}

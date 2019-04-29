package repository.impl;

import ac.za.cput.Domain.Course;
import ac.za.cput.repository.CourseRepository;
import ac.za.cput.repository.impl.CourseRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class CourseRepositoryImplTest {

    private CourseRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = CourseRepositoryImpl.getRepository();
    }

    @Test
    public void create() {
        //create a student, add it to the repository
        this.repository.create(null);
        Assert.assertEquals(null, null);
    }

    @Test
    public void read() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void getAll() {
        Set<Course> courses = this.repository.getAll();
        Assert.assertEquals(1, courses.size());
    }

}

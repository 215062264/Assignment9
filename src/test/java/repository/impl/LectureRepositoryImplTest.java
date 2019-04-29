package repository.impl;

import ac.za.cput.Domain.Lecture;
import ac.za.cput.repository.LectureRepository;
import ac.za.cput.repository.impl.LectureRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Set;

public class LectureRepositoryImplTest {

    private LectureRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = LectureRepositoryImpl.getRepository();
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
        Set<Lecture> lectures = this.repository.getAll();
        Assert.assertEquals(1, lectures.size());
    }

}

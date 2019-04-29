package repository.impl;

import ac.za.cput.Domain.Exam;
import ac.za.cput.repository.ExamRepository;
import ac.za.cput.repository.impl.ExamRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Set;

public class ExamRepositoryImplTest {

    private ExamRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = ExamRepositoryImpl.getRepository();
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
        Set<Exam> exams = this.repository.getAll();
        Assert.assertEquals(1, exams.size());
    }

}

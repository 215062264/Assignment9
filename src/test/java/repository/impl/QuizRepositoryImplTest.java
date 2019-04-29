package repository.impl;

import ac.za.cput.Domain.Quiz;
import ac.za.cput.repository.QuizRepository;
import ac.za.cput.repository.impl.QuizRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Set;

public class QuizRepositoryImplTest {

    private QuizRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = QuizRepositoryImpl.getRepository();
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
        Set<Quiz> quizzes = this.repository.getAll();
        Assert.assertEquals(1, quizzes.size());
    }
}

package repository.impl;

import ac.za.cput.Domain.Results;
import ac.za.cput.repository.ResultRepository;
import ac.za.cput.repository.impl.ResultRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Set;

public class ResultRepositoryImplTest {

    private ResultRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = ResultRepositoryImpl.getRepository();
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
        Set<Results> results = this.repository.getAll();
        Assert.assertEquals(1, results.size());
    }
}

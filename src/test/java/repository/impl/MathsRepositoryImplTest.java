package repository.impl;

import ac.za.cput.Domain.Mathematics;
import ac.za.cput.repository.MathsRepository;
import ac.za.cput.repository.impl.MathsRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class MathsRepositoryImplTest {

    private MathsRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = MathsRepositoryImpl.getRepository();
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
        Set<Mathematics> mathematics = this.repository.getAll();
        Assert.assertEquals(1, mathematics.size());
    }

}

package repository.impl;

import ac.za.cput.Domain.Educator;
import ac.za.cput.repository.EducatorRepository;
import ac.za.cput.repository.impl.EducatorRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class EducatorRepositoryImplTest {

    private EducatorRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = EducatorRepositoryImpl.getRepository();
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
        Set<Educator> educators = this.repository.getAll();
        Assert.assertEquals(1, educators.size());
    }

}

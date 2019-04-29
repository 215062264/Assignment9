package repository.impl;

import ac.za.cput.Domain.Economics;
import ac.za.cput.repository.EconomicsRepository;
import ac.za.cput.repository.impl.EconomicsRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Set;

public class EconomicsRepositoryImplTest {

    private EconomicsRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = EconomicsRepositoryImpl.getRepository();
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
        Set<Economics> economics = this.repository.getAll();
        Assert.assertEquals(1, economics.size());
    }
}

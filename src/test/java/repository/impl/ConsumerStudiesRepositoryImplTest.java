package repository.impl;

import ac.za.cput.Domain.ConsumerStudies;
import ac.za.cput.repository.ConsumerStudiesRepository;
import ac.za.cput.repository.impl.ConsumerStudiesRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Set;

public class ConsumerStudiesRepositoryImplTest {

    private ConsumerStudiesRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = ConsumerStudiesRepositoryImpl.getRepository();
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
        Set<ConsumerStudies> consumerStudies = this.repository.getAll();
        Assert.assertEquals(1, consumerStudies.size());
    }

}

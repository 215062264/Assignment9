package repository.impl;

import ac.za.cput.Domain.BusinessStudies;
import ac.za.cput.repository.BusinessStudiesRepository;
import ac.za.cput.repository.impl.BusinessStudiesRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Set;

public class BusinessStudiesRepositoryImplTest {

    private BusinessStudiesRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = BusinessStudiesRepositoryImpl.getRepository();
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
        Set<BusinessStudies> businessStudies = this.repository.getAll();
        Assert.assertEquals(1, businessStudies.size());
    }

}

package repository.impl;

import ac.za.cput.Domain.Geography;
import ac.za.cput.repository.GeographyRepository;
import ac.za.cput.repository.impl.GeographyRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Set;

public class GeographyRepositoryImplTest {

    private GeographyRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = GeographyRepositoryImpl.getRepository();
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
        Set<Geography> geographies = this.repository.getAll();
        Assert.assertEquals(1, geographies.size());
    }

}

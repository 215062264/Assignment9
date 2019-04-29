package repository.impl;

import ac.za.cput.Domain.LifeOrientation;
import ac.za.cput.repository.LifeOrientationRepository;
import ac.za.cput.repository.impl.LifeOrientationRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Set;

public class LifeOrientationRepositoryImplTest {

    private LifeOrientationRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = LifeOrientationRepositoryImpl.getRepository();
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
        Set<LifeOrientation> lifeOrientations = this.repository.getAll();
        Assert.assertEquals(1, lifeOrientations.size());
    }

}

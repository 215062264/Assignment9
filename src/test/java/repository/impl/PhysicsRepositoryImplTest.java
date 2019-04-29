package repository.impl;


import ac.za.cput.Domain.Physics;
import ac.za.cput.repository.PhysicsRepository;
import ac.za.cput.repository.impl.PhysicsRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Set;

public class PhysicsRepositoryImplTest {

    private PhysicsRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = PhysicsRepositoryImpl.getRepository();
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
        Set<Physics> physics = this.repository.getAll();
        Assert.assertEquals(1, physics.size());
    }

}

package repository.impl;

import ac.za.cput.Domain.CivilEngineering;
import ac.za.cput.repository.CivilEngineeringRepository;
import ac.za.cput.repository.impl.CivilEngineeringRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Set;

public class CivilEngineeringRepositoryImplTest {

    private CivilEngineeringRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = CivilEngineeringRepositoryImpl.getRepository();
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
        Set<CivilEngineering> civilEngineerings = this.repository.getAll();
        Assert.assertEquals(1, civilEngineerings.size());
    }

}

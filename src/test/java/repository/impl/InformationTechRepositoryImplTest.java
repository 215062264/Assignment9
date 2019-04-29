package repository.impl;

import ac.za.cput.Domain.InformationTech;
import ac.za.cput.repository.InformationTechRepository;
import ac.za.cput.repository.impl.InformationTechRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class InformationTechRepositoryImplTest {

    private InformationTechRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = InformationTechRepositoryImpl.getRepository();
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
        Set<InformationTech> informationTeches = this.repository.getAll();
        Assert.assertEquals(1, informationTeches.size());
    }

}

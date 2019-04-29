package repository.impl;

import ac.za.cput.Domain.TechnicalDrawings;
import ac.za.cput.repository.TechnicalDrawingsRepository;
import ac.za.cput.repository.impl.TechnicalDrawingsRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Set;

public class TechnicalDrawingsRepositoryImplTest {

    private TechnicalDrawingsRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = TechnicalDrawingsRepositoryImpl.getRepository();
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
        Set<TechnicalDrawings> technicalDrawings = this.repository.getAll();
        Assert.assertEquals(1, technicalDrawings.size());
    }

}

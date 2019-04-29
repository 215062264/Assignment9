package repository.impl;

import ac.za.cput.Domain.English;
import ac.za.cput.repository.EnglishRepository;
import ac.za.cput.repository.impl.EnglishRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Set;

public class EnglishRepositoryImplTest {

    private EnglishRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = EnglishRepositoryImpl.getRepository();
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
        Set<English> englishes = this.repository.getAll();
        Assert.assertEquals(1, englishes.size());
    }

}

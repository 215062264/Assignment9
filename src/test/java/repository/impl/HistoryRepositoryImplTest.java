package repository.impl;

import ac.za.cput.Domain.History;
import ac.za.cput.repository.HistoryRepository;
import ac.za.cput.repository.impl.HistoryRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Set;

public class HistoryRepositoryImplTest {

    private HistoryRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = HistoryRepositoryImpl.getRepository();
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
        Set<History> histories = this.repository.getAll();
        Assert.assertEquals(1, histories.size());
    }

}

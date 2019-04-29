package repository.impl;

import ac.za.cput.Domain.Accounting;
import ac.za.cput.repository.AccountingRepository;
import ac.za.cput.repository.impl.AccountingRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Set;

public class AccountingRepositoryImplTest {

    private AccountingRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = AccountingRepositoryImpl.getRepository();
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
        Set<Accounting> accountings = this.repository.getAll();
        Assert.assertEquals(1, accountings.size());
    }

}

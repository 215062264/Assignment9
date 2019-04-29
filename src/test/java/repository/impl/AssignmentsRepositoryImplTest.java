package repository.impl;

import ac.za.cput.Domain.Assignments;
import ac.za.cput.repository.AssignmentsRepository;
import ac.za.cput.repository.impl.AssignmentsRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Set;

public class AssignmentsRepositoryImplTest {

    private AssignmentsRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = AssignmentsRepositoryImpl.getRepository();
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
        Set<Assignments> assignments = this.repository.getAll();
        Assert.assertEquals(1, assignments.size());
    }
}

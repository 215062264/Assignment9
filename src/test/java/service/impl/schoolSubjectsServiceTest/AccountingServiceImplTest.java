package service.impl.schoolSubjectsServiceTest;

import ac.za.cput.domain.schoolSubjects.Accounting;
import ac.za.cput.factory.schoolSubjectsFactory.AccountingFactory;
import ac.za.cput.repository.impl.AccountingRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AccountingServiceImplTest {

    private AccountingRepositoryImpl repository;
    private Accounting accounting;

    private Accounting getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = (AccountingRepositoryImpl) AccountingRepositoryImpl.getRepository();
        this.accounting = AccountingFactory.getAccounting("ACT",70);
    }

    @Test
    public void a_create() {
        Accounting created = this.repository.create(this.accounting);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.accounting);
    }

    @Test
    public void c_update() {
        String newCourseName = "Accounting ACT";
        Accounting updated = new Accounting.Builder().copy(getSaved()).subjectCode(newCourseName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newCourseName, updated.getSubjectCode());
    }

    @Test
    public void e_delete() {
        Accounting saved = getSaved();
        this.repository.delete(saved.getSubjectCode());
        d_getAll();
    }

    @Test
    public void b_read() {
        Accounting saved = getSaved();
        Accounting read = this.repository.read(saved.getSubjectCode());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Accounting> accountings = this.repository.getAll();
        System.out.println("In getall, all = " + accountings);
    }
}

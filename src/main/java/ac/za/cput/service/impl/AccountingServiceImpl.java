package ac.za.cput.service.impl;

import ac.za.cput.domain.schoolSubjects.Accounting;
import ac.za.cput.repository.AccountingRepository;
import ac.za.cput.repository.impl.AccountingRepositoryImpl;
import ac.za.cput.service.AccountingService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class AccountingServiceImpl implements AccountingService {

    private AccountingServiceImpl service = null;
    private AccountingRepository repository;

    private AccountingServiceImpl(){
        this.repository = AccountingRepositoryImpl.getRepository();
    }

    public AccountingService getService(){
        if (service == null) service = new AccountingServiceImpl();
        return service;
    }


    @Override
    public Accounting create(Accounting course) {
        return this.repository.create(course);
    }

    @Override
    public Accounting update(Accounting course) {
        return this.repository.update(course);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Accounting read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Accounting> getAllAccounting() {
        Set<Accounting> accountings = getAll();

        return null;
    }

    @Override
    public Set<Accounting> getAll() {
        return this.repository.getAll();
    }

}

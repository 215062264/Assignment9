package ac.za.cput.repository.impl;

import ac.za.cput.Domain.Accounting;
import ac.za.cput.repository.AccountingRepository;
import java.util.HashSet;
import java.util.Set;

public class AccountingRepositoryImpl implements AccountingRepository {

    private static AccountingRepositoryImpl repository = null;
    private Set<Accounting> accountings;

    private AccountingRepositoryImpl() {
        this.accountings = new HashSet<>();
    }

    public static AccountingRepository getRepository(){
        if(repository == null) repository = new AccountingRepositoryImpl();
        return repository;
    }

    public Accounting create(Accounting accountings){
        this.accountings.add(accountings);
        return accountings;
    }

    public Accounting read(String subjectCode){
        //find the student in the set and return it if it exist
        return null;
    }

    public Accounting update(Accounting accountings) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String subjectCode) {
        //find the student and delete it if it exists

    }

    public Set<Accounting> getAll(){
        return this.accountings;
    }


}

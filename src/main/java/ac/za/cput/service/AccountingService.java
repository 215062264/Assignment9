package ac.za.cput.service;

import ac.za.cput.domain.schoolSubjects.Accounting;

import java.util.Set;

public interface AccountingService extends IService <Accounting, String>{

    Set<Accounting> getAllAccounting();
    Set<Accounting> getAll();

}

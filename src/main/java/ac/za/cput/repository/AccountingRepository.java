package ac.za.cput.repository;

import ac.za.cput.domain.schoolSubjects.Accounting;
import java.util.Set;


public interface AccountingRepository extends IRepository<Accounting, String> {
    Set<Accounting> getAll();

}
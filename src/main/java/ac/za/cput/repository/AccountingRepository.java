package ac.za.cput.repository;

import ac.za.cput.Domain.Accounting;
import java.util.Set;


public interface AccountingRepository extends IRepository<Accounting, String> {
    Set<Accounting> getAll();

}
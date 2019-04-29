package ac.za.cput.repository;

import ac.za.cput.Domain.Economics;
import java.util.Set;

public interface EconomicsRepository extends IRepository<Economics, String> {
    Set<Economics> getAll();

}
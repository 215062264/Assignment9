package ac.za.cput.repository;

import ac.za.cput.Domain.English;
import java.util.Set;

public interface EnglishRepository extends IRepository<English, String> {
    Set<English> getAll();

}
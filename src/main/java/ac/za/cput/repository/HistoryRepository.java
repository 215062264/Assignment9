package ac.za.cput.repository;

import ac.za.cput.domain.schoolSubjects.History;
import java.util.Set;


public interface HistoryRepository extends IRepository<History, String> {
    Set<History> getAll();

}
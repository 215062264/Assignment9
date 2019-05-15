package ac.za.cput.repository;

import ac.za.cput.domain.people.Lecture;
import java.util.Set;

public interface LectureRepository extends IRepository<Lecture, String> {
    Set<Lecture> getAll();

}
package ac.za.cput.repository;

import ac.za.cput.Domain.Lecture;
import java.util.Set;

public interface LectureRepository extends IRepository<Lecture, String> {
    Set<Lecture> getAll();

}
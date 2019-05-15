package ac.za.cput.service;

import ac.za.cput.domain.people.Lecture;

import java.util.Set;

public interface LectureService extends IService<Lecture, String> {
    Set<Lecture> getAllLO();
    Set<Lecture> getAll();
}

package ac.za.cput.repository.impl;

import ac.za.cput.domain.people.Lecture;
import ac.za.cput.repository.LectureRepository;
import java.util.HashSet;
import java.util.Set;

public class LectureRepositoryImpl implements LectureRepository {

    private static LectureRepositoryImpl repository = null;
    private Set<Lecture> lectures;

    private LectureRepositoryImpl() {
        this.lectures = new HashSet<>();
    }

    private Lecture findS(String professorId) {
        return this.lectures.stream()
                .filter(lecture -> lecture.getProfessor().trim().equals(professorId))
                .findAny()
                .orElse(null);
    }

    public static LectureRepository getRepository(){
        if(repository == null) repository = new LectureRepositoryImpl();
        return repository;
    }

    public Lecture create(Lecture lectures){
        this.lectures.add(lectures);
        return lectures;
    }

    public Lecture read(final String professorId){
        Lecture lecture = findS(professorId);
        return lecture;
    }

    public void delete(String professorId) {
        Lecture lecture = findS(professorId);
        if (lecture != null) this.lectures.remove(lecture);
    }

    public Lecture update(Lecture lecture){
        Lecture toDelete = findS(lecture.getProfessor());
        if(toDelete != null) {
            this.lectures.remove(toDelete);
            return create(lecture);
        }
        return null;
    }

    public Set<Lecture> getAll(){
        return this.lectures;
    }

}

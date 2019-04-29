package ac.za.cput.repository.impl;

import ac.za.cput.Domain.TechnicalDrawings;
import ac.za.cput.repository.TechnicalDrawingsRepository;
import java.util.HashSet;
import java.util.Set;

public class TechnicalDrawingsRepositoryImpl implements TechnicalDrawingsRepository {

    private static TechnicalDrawingsRepositoryImpl repository = null;
    private Set<TechnicalDrawings> technicalDrawings;

    private TechnicalDrawingsRepositoryImpl() {
        this.technicalDrawings = new HashSet<>();
    }

    public static TechnicalDrawingsRepository getRepository(){
        if(repository == null) repository = new TechnicalDrawingsRepositoryImpl();
        return repository;
    }

    public TechnicalDrawings create(TechnicalDrawings technicalDrawings){
        this.technicalDrawings.add(technicalDrawings);
        return technicalDrawings;
    }

    public TechnicalDrawings read(String subjectCode){
        //find the student in the set and return it if it exist
        return null;
    }

    public TechnicalDrawings update(TechnicalDrawings mathematics) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String subjectCode) {
        //find the student and delete it if it exists

    }

    public Set<TechnicalDrawings> getAll(){
        return this.technicalDrawings;
    }


}

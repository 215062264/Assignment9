package ac.za.cput.repository.impl;

import ac.za.cput.Domain.History;
import ac.za.cput.repository.HistoryRepository;
import java.util.HashSet;
import java.util.Set;

public class HistoryRepositoryImpl implements HistoryRepository {

    private static HistoryRepositoryImpl repository = null;
    private Set<History> histories;

    private HistoryRepositoryImpl() {
        this.histories = new HashSet<>();
    }

    public static HistoryRepository getRepository(){
        if(repository == null) repository = new HistoryRepositoryImpl();
        return repository;
    }

    public History create(History histories){
        this.histories.add(histories);
        return histories;
    }

    public History read(String subjectCode){
        //find the student in the set and return it if it exist
        return null;
    }

    public History update(History histories) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String subjectCode) {
        //find the student and delete it if it exists

    }

    public Set<History> getAll(){
        return this.histories;
    }


}
